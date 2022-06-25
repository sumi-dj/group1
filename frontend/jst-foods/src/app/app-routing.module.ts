import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { CustomerRegistrationComponent } from './customer-registration/customer-registration.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  
    {path:'home',component:HomeComponent},
    {path:'signup',component:CustomerRegistrationComponent},
    {path:'login',component:CustomerLoginComponent},
    {path:'about',component:AboutComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
