import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
URL='http://localhost:8081/customer';
  constructor(private http:HttpClient) { }


fnCreate(customer:any)
{
  return this.http.post(this.URL,customer);
}
fnLogin(authRequest:any)
{
  return this.http.post(this.URL+"/login",authRequest);
}
}



