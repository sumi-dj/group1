import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class AddmenuService {
  URL="http://localhost:5002/menu";

  constructor(private http:HttpClient) { }

  fnGetAllMenus()
  {
    return this.http.get(this.URL);
  }

  fnAddMenu(menu:any)
  {
    return this.http.post(this.URL+"/add",menu);
  }

  fnFindMenuById(id:any)
  {
    return this.http.get(this.URL+"/"+id);
  }
}
