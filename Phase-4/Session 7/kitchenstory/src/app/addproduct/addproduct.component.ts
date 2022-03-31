import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Product } from '../Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private productService: ProductService) {

  }

  registerform: FormGroup;

  product: Product = new Product();

  submitted: boolean = false;

  ngOnInit(): void {
    this.registerform = this.formBuilder.group({
      id: ['', Validators.required],
      name: ['', Validators.required],
      price: ['', Validators.required],
      description: ['', Validators.required]
    })
  }

  get f() {
    return this.registerform.controls;
  }

  onSubmit() {
    this.submitted = true;

    if (this.registerform.invalid)
      return;
    else {
      console.log(this.product);
      this.productService.addProduct(this.product);
      this.router.navigateByUrl('list');
    }
    
  }

}

