import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';

import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerRegistrationComponent } from './customer-registration/customer-registration.component';
import{ HttpClientModule }from '@angular/common/http';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AboutComponent } from './about/about.component';
import { MenuComponent } from './menu/menu.component';
import { DeliveryPartnerComponent } from './delivery-partner/delivery-partner.component';

import { AddMenuComponent } from './add-menu/add-menu.component';
import { DisplayMenuComponent } from './display-menu/display-menu.component';
import { ViewCartComponent } from './view-cart/view-cart.component';
import { FooterComponentComponent } from './footer-component/footer-component.component';
import { FoodComponent } from './food/food.component';
import { FooterComponent } from './footer/footer.component';







@NgModule({
  declarations: [
    AppComponent,
    CustomerRegistrationComponent,
    CustomerLoginComponent,
    HomeComponent,
    NavbarComponent,
    AboutComponent,
    MenuComponent,
    DeliveryPartnerComponent,
 
    AddMenuComponent,
    DisplayMenuComponent,
    ViewCartComponent,
    FooterComponentComponent,
    FoodComponent,
    FooterComponent

 
    
  
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
