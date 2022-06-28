import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DeliveryPartnerService {
 URL='hhtp://localhost:8081/customer'
  constructor(private http:HttpClient) { }
  fnCreate(deliverypartner:any){
    return this.http.post(this.URL,deliverypartner);
  }
}
