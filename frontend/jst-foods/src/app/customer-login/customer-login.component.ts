import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { RouterLinkWithHref } from '@angular/router';
import { CustomerRegistrationService } from '../custome-registration.service';

@Component({
  selector: 'app-customer-login',
  templateUrl: './customer-login.component.html',
  styleUrls: ['./customer-login.component.css']
})
// export class CustomerLoginComponent implements OnInit {
// customerLoginForm:any;
// isLogin = false;
// o:any;
//   constructor(private fb:FormBuilder,private cs:CustomerRegistrationService) { this.customerLoginForm=this.fb.group({
     
//     id:[],
//     // name:[],
//     password:[]
    
//   }); }
//   ngOnInit(): void {
//   }
//     fnsubmit()
//     {
//       alert("hi");
//       this.o=this.cs.fnLogin(this.customerLoginForm.value).subscribe((data)=>console.log(data));
//       if(this.o!=null)
//       {
//         alert("u are logged in");
         
//       }
//     }
    
//   }
 
  



export class CustomerLoginComponent implements OnInit {
  customerLoginForm:FormGroup;
  isLogin = false;
  o:any;
    constructor(private fb:FormBuilder,private cs:CustomerRegistrationService) { 
      this.customerLoginForm=this.fb.group({
      id:[null, Validators.required],
      password:[null, Validators.required]
      
    }); }
    ngOnInit(): void {
    }
      fnsubmit()
      {
        if(this.customerLoginForm.invalid){
          alert('Valid login credential required')
          return;
        } 
        alert("hi");
        this.o=this.cs.fnLogin(this.customerLoginForm.value).subscribe((data)=>console.log(data));
        if(this.o!=null)
        {
          alert("u are logged in");
           
        }
      }
      
    }
   
    
  
  
  
  