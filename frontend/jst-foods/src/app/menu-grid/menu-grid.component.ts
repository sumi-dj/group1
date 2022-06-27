import { Component, OnInit } from '@angular/core';
import { MenuService } from '../menu.service';

@Component({
  selector: 'app-menu-grid',
  templateUrl: './menu-grid.component.html',
  styleUrls: ['./menu-grid.component.css']
})
export class MenuGridComponent implements OnInit {
menus:any;
  constructor(private ms:MenuService) { }

  ngOnInit(): void {
    this.ms.retrieveAllItems().subscribe((data)=>{
      this.menus=data;
    });
  }
   fnSelect(name:any,id:any)
   {
    alert("hi you have selected "+name);
    this.ms.findMenuById(id).subscribe((data)=>{
     // console.log(data)
     
    })
   }
}
