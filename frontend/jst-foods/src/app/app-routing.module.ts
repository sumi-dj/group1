import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AddMenuComponent } from './add-menu/add-menu.component';


import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { CustomerRegistrationComponent } from './customer-registration/customer-registration.component';
import { DeliveryPartnerComponent } from './delivery-partner/delivery-partner.component';
import { DisplayMenuComponent } from './display-menu/display-menu.component';
import { HomeComponent } from './home/home.component';

import { MenuComponent } from './menu/menu.component';
import { ViewCartComponent } from './view-cart/view-cart.component';

const routes: Routes = [
  
    {path:'home',component:HomeComponent},
    {path:'signup',component:CustomerRegistrationComponent},
    {path:'login',component:CustomerLoginComponent},
    {path:'about',component:AboutComponent},
    {path:'menu',component:MenuComponent},
    {path:'dp',component:DeliveryPartnerComponent},
    // {path:'ac',component:AdminCarComponent},
    {path:'am',component:AddMenuComponent},
    {path:'dm',component:DisplayMenuComponent},
    {path:'v',component:ViewCartComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
