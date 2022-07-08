import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  URL="http://localhost:8081/cart";
  constructor(private http:HttpClient) { }

  fnAddToCart(cart:any)
  {
    alert("hi");
    return this.http.post(this.URL,cart);
  }

  fnFindCartByCid(cid:any)
  {  alert(cid);
    return this.http.get(this.URL+"/customer/"+cid);
  }
}
