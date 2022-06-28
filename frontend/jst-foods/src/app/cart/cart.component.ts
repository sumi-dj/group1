import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  menuForm:any;
  selectedFile:any;
  menus:any;
 constructor(private fb:FormBuilder,private ms:CartService) { 
 
 this.menuForm=this.fb.group({
   id:[],
   name:[],
   description:[],
   price:[],
   picture:[]
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
//    const formData=new FormData();
//    formData.append('id',this.menuForm.controls.id.value);
//    formData.append('name',this.menuForm.controls.name.value);
//    formData.append('price',this.menuForm.controls.price.value);
//    formData.append('description',this.menuForm.controls.description.value);
//    formData.append('picture',this.selectedFile);
//    console.log(formData);
//    this.ms.addMenu(formData).subscribe((data)=>{
//        console.log(data);
// })}
updateMenu()
{
 this.ms.updateMenu(this.menuForm.value).subscribe((data)=>{
   console.log(data);
 })
}
deleteMenu()
{
 this.ms.deleteMenu(this.menuForm.value).subscribe((data)=>{
   console.log(data);
 })
}
fnSelect(name:any,id:any)
  {
   alert("hi you have selected "+name);
   this.ms.findMenuById(id).subscribe((data)=>{
    // console.log(data)
    this.menuForm.patchValue(data);
   })
  }

}
