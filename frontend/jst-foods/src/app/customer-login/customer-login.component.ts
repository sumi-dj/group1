import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { RouterLinkWithHref } from '@angular/router';
import { CustomerRegistrationService } from '../custome-registration.service';

@Component({
  selector: 'app-customer-login',
  templateUrl: './customer-login.component.html',
  styleUrls: ['./customer-login.component.css']
})
export class CustomerLoginComponent implements OnInit {
customerLoginForm:any;
o:any;
  constructor(private fb:FormBuilder,private cs:CustomerRegistrationService) { this.customerLoginForm=this.fb.group({
     
   
    name:[],
    password:[]
    
  }); }
  ngOnInit(): void {
  }
    fnsubmit()
    {
      alert("hi");
      this.o=this.cs.fnLogin(this.customerLoginForm.value).subscribe((data)=>console.log(data));
      if(this.o!=null)
      {
           
         
      }
    }
  }
 
  



