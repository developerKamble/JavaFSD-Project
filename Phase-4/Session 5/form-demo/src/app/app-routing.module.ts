import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [

  {"path":"register",component:RegisterComponent},
  {"path":"switch",component:SwitchdemoComponent},
  {"path":"pipe",component:PipeDemoComponent},
  {"path":"user",component:UserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
