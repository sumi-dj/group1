import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MenuServiceService {
  URL='http://localhost:8082/customer'
  constructor(private http:HttpClient) { }
  retrieveAllItems():Observable<any>
  {
    return this.http.get(this.URL);
  }
  findMenuById(id:number)
  {
    return this.http.get(this.URL+"/"+id);
  }
  addMenu(menu:any)
  {
    return this.http.post(this.URL,menu);
  }
  updateMenu(menu:any)
  {
    return this.http.put(this.URL,menu);
  }
  deleteMenu(menu:any)
  {
    return this.http.delete(this.URL,menu);
  }
} 


