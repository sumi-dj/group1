import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { MenuService } from '../menu.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  menuForm:any;
  menuForm1:any;
  selectedFile:any;
  menus:any;
 constructor(private fb:FormBuilder,private ms:MenuService) { 
 
 this.menuForm=this.fb.group({
   id:[],
   name:[],
   description:[],
   price:[]
  
 });
 }
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
addMenu1()
{   alert("hi");
    
    const id1=1
    const description="nonveg"
    const name="biriyani"
    const price=300
    var menuForm1=new Object(name);

  this.ms.addMenu(this.menuForm1.value).subscribe((data)=>{
    console.log(data);
  })}


}

