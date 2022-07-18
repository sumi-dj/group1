import { Component, OnInit } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-view-cart',
  templateUrl: './view-cart.component.html',
  styleUrls: ['./view-cart.component.css']
})
export class ViewCartComponent implements OnInit {
  carts:any;
  
  constructor(private cartService:CartService) { }

//  
  ngOnInit(): void {
    const userdetails = localStorage.getItem('userdetails') as string;
    const jsonData = JSON.parse(userdetails);
    console.log(jsonData);
    
   this.cartService.fnFindCartByCid(jsonData.id).subscribe((data)=>{
      this.carts=data;
    })
  }

}

