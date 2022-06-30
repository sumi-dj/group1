import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

  export class AdminCarService {
   
    URL='http://localhost:5002/menu'
    URL1='http://localhost:8083/cart'
    constructor(private http:HttpClient) { }
    retrieveAllItems():Observable<any>
    {
      return this.http.get(this.URL);
    }
    findMenuById(menu_id:number)
    {
      return this.http.get(this.URL+"/"+menu_id);
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
    getAllMenus(menu:any)
    {
      return this.http.get(this.URL,menu);
    }
    addMenutoCart(menu:any)
    {
      // return this.http.post(this.URL1,menu);
      return this.http.post(this.URL1,menu);
    }
  } 
  
  
