import { Component, OnInit } from '@angular/core';
import { AddmenuService } from '../addmenu.service';
import { CartService } from '../cart.service';
import { CustomerRegistrationService } from '../custome-registration.service';

@Component({
  selector: 'app-display-menu',
  templateUrl: './display-menu.component.html',
  styleUrls: ['./display-menu.component.css']
})
export class DisplayMenuComponent implements OnInit {
  menus:any;
  constructor(private as:AddmenuService, private cs:CustomerRegistrationService,private cartS:CartService) { }

  ngOnInit(): void {
    this.as.fnGetAllMenus().subscribe((data)=>{
      console.log(data);
      this.menus=data;
      console.log(this.menus);
    },(error)=>{
      console.log(error);
    });
  }

//   fnAddToCart(name:any,id:any)
//   {
//     alert("wow nice choice : "+name);
//      var menu:any;
//      var customer:any;

//      this.as.fnFindMenuById(id).subscribe((data)=>{
//        menu=data;
// console.log(menu)
//     //   //take the logged in customer id from localStorage
//        var cid=1;
//        const userdetails=localStorage.getItem('userdetail')
//       // var cid=localStorage.getItem("id");
      
//        this.cs.fnFindCustomerById(cid).subscribe((data)=>{
//          customer=data;

//          console.log(customer)
      
//        var cart={"menu":menu,"customer":customer};
//        console.log(cart);
//           this.cartS.fnAddToCart(cart).subscribe((data)=>{
//          console.log("After adding, we got the following response from add to cart");
//          console.log(data);

          
//         });
//        });
      
//     }
//      )
//    }
//  }
fnAddToCart(name: any, id: any) {
  alert("wow nice choice : " + name);
  var menu: any;
  var customer: any;

  this.as.fnFindMenuById(id).subscribe((data) => {
    menu = data;
    console.log(menu)
    //   //take the logged in customer id from localStorage
    const userdetails = localStorage.getItem('userdetails') as string;
  const jsonData = JSON.parse(userdetails);
  console.log(jsonData);
    var cid = jsonData.id;
    // var cid=localStorage.getItem("id");

    this.cs.fnFindCustomerById(cid).subscribe((data) => {
      customer = data;

      console.log(customer)

      var cart = { "menu": menu, "customer": customer };
      console.log(cart);
      this.cartS.fnAddToCart(cart).subscribe((data) => {
        console.log("After adding, we got the following response from add to cart");
        console.log(data);


      });
    });

  }
  )
}
}
