import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './registration/registration.component';
import { UserComponent } from './user/user.component';
import { PipedemoComponent } from './pipedemo/pipedemo.component';
import { SwitchdemoComponent } from './switchdemo/switchdemo.component';

@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    UserComponent,
    PipedemoComponent,
    SwitchdemoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
