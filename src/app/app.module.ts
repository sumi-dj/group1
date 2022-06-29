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
import { MenuGridComponent } from './menu-grid/menu-grid.component';
import { CartComponent } from './cart/cart.component';
import { DeliveryPartnerComponent } from './delivery-partner/delivery-partner.component';





@NgModule({
  declarations: [
    AppComponent,
    CustomerRegistrationComponent,
    CustomerLoginComponent,
    HomeComponent,
    NavbarComponent,
    AboutComponent,
    MenuComponent,
    MenuGridComponent,
    CartComponent,
    DeliveryPartnerComponent,
 
    
  
   
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
