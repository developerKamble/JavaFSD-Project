import { Component, EventEmitter, OnInit } from '@angular/core';

@Component({
  selector: 'app-child-component',
  templateUrl: './child-component.component.html',
  styleUrls: ['./child-component.component.css']
  inputs:['pdata'],
  outputs: ['cevent']

})
export class ChildComponentComponent implements OnInit {

  pdata: string=""
  constructor() { }

  ngOnInit(): void {
  }
  content=new EventEmitter<string>();
  onchange(value:string){
    this.cevent.emit(value);
  }
}
