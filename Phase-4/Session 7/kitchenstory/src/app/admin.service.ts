import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  admin:{"username":"komal","password":"komal@123"}
  login:(uname:string , password:string){
    if(uname===this.admin.username && password====this.admin.password)
      return true;
    else
      return false;
 }
  constructor() { }
}
