import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-delivery-partner',
  templateUrl: './delivery-partner.component.html',
  styleUrls: ['./delivery-partner.component.css']
})
export class DeliveryPartnerComponent implements OnInit {
  deliveryPartnerregistrationForm:any;

  constructor(private fb: FormBuilder) {
    this.deliveryPartnerregistrationForm=this.fb.group({
      name:[],
      location:[],
      rating:[],
      suggestions:[]
    });
   }

  ngOnInit(): void {
  }
  fnSubmit(){
    alert("Submitted")
  }
}
