import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
  
})
export class RegistrationComponent implements OnInit {

  registerForm:FormGroup;
  submitted:boolean=false;
  constructor(private builder: FormBuilder) { }
  ngOnInit(): void {
    this.registerForm= this.builder.group({
      firstName:["",Validators.required],
      lastName:["",Validators.required],
      email:["",[Validators.required,Validators.email]],
      password:["",[Validators.required,Validators.minLength(8)]]
    });
  }
  onSubmit()
  {
    this.submitted=true;
    if(this.registerForm.invalid)
      return;
    else
      alert("Form submitted and sent for approval")
  }
  get f()
  {
    return this.registerForm.controls;
  }
}

