import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { CustomerRegistrationService } from '../custome-registration.service';

@Component({
  selector: 'app-customer-registration',
  templateUrl: './customer-registration.component.html',
  styleUrls: ['./customer-registration.component.css']
})
export class CustomerRegistrationComponent implements OnInit {
  customerRegistrationForm: any;
  o: any;
  constructor(private fb: FormBuilder, private crs: CustomerRegistrationService) {
    this.customerRegistrationForm = this.fb.group({

      contact: ['', [Validators.required, Validators.min(10)]],
      email: ['', [Validators.required]],
      name: ['', [Validators.required]],
      password: ['', [Validators.required, Validators.min(8)]],
      cpassword: ['', [Validators.required]]
    });
  }

  ngOnInit(): void {
  }

  fnSubmit() {
    var email=this.customerRegistrationForm.controls.email.value;
    alert(email);
    this.crs.fnEmail(email).subscribe((data=>{
      console.log(data);
      // this.o=this.crs.fnCreate(this.customerRegistrationForm.value).subscribe((data)=>console.log(data));
      // if(this.o!=null)
      // {
      //    alert("Sign-up successfull: You can login and Enjoy");
      // }
    }),(error)=>{
      console.log("email does not exist")
      //proceed to add new customer
      this.o=this.crs.fnCreate(this.customerRegistrationForm.value).subscribe((data)=>console.log(data));
  if(this.o!=null)
  {
     alert("Sign-up successfull: You can login and Enjoy");
  }
  else{
    alert("please sign up");
  }
    })
  }
}
