import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { CustomerRegistrationService } from '../custome-registration.service';

@Component({
  selector: 'app-customer-registration',
  templateUrl: './customer-registration.component.html',
  styleUrls: ['./customer-registration.component.css']
})
export class CustomerRegistrationComponent implements OnInit {
  customerRegistrationForm:any;
  constructor(private fb:FormBuilder,private crs:CustomerRegistrationService) {
    this.customerRegistrationForm=this.fb.group({
     
      contact:[],
      email:[],
      name:[],
      password:[],
      cpassword:[]
    });
   }

  ngOnInit(): void {
  }

fnSubmit()
{
  alert("hi");
  this.crs.fnCreate(this.customerRegistrationForm.value).subscribe((data)=>console.log(data));
}
}
