import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { CartComponent } from './cart/cart.component';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { CustomerRegistrationComponent } from './customer-registration/customer-registration.component';
import { DeliveryPartnerComponent } from './delivery-partner/delivery-partner.component';
import { HomeComponent } from './home/home.component';
import { MenuGridComponent } from './menu-grid/menu-grid.component';
import { MenuComponent } from './menu/menu.component';

const routes: Routes = [
  
    {path:'home',component:HomeComponent},
    {path:'signup',component:CustomerRegistrationComponent},
    {path:'login',component:CustomerLoginComponent},
    {path:'about',component:AboutComponent},
    {path:'menu',component:MenuComponent},
    {path:'menugrid',component:MenuGridComponent},
    {path:'cart',component:CartComponent},
    {path:'dp',component:DeliveryPartnerComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
