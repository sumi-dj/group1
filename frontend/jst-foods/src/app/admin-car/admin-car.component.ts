import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { AdminCarService } from '../admin-car.service';

@Component({
  selector: 'app-admin-car',
  templateUrl: './admin-car.component.html',
  styleUrls: ['./admin-car.component.css']
})
export class AdminCarComponent implements OnInit {
  menuForm:any;
  selectedFile:any;
  menus:any;
  cartForm:any
 constructor(private fb:FormBuilder,private ms:AdminCarService) { 
 
 this.menuForm=this.fb.group({
   menu_id:[],
   name:[],
   description:[],
   price:[]
  
 });}
 ngOnInit(): void {
   this.ms.retrieveAllItems().subscribe((data)=>{
     this.menus=data;
   });
 }
 onFileChanged(event:any)
 {
   this.selectedFile=event.target.files[0];
   console.log(JSON.stringify(this.selectedFile));
 }
addMenu()
{
  this.ms.addMenu(this.menuForm.value).subscribe((data)=>{
    console.log(data);
  })}
updateMenu()
{
 this.ms.updateMenu(this.menuForm.value).subscribe((data)=>{
   console.log(data);
 })
}
getAllMenus()
{
 this.ms.getAllMenus(this.menuForm.value).subscribe((data)=>{
   console.log(data);
 })
}
deleteMenu()
{
 this.ms.deleteMenu(this.menuForm.value).subscribe((data)=>{
   console.log(data);
 })
}
// fnSelect(name:any,menu_id:any,price:any)
//   {
//    alert("hi you have selected "+name);
//    var n=name
//    var p=price
//    this.ms.findMenuById(menu_id).subscribe((data)=>{
//     // console.log(data)
//     this.menuForm.patchValue(data);
//    })
//   }
  
fnADD(name:any)
  {
    alert(name);
     this.ms.addMenutoCart(name).subscribe((data)=>{
      console.log(data);
    

  })

}
}
