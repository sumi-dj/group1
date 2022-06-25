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
   selectedFile:any;
  constructor(private fb:FormBuilder,private ms:MenuService) { 
  
  this.menuForm=this.fb.group({
    id:[],
    name:[],
    description:[],
    price:[],
    picture:[]
  });}
  ngOnInit(): void {
  }
  onFileChanged(event:any)
  {
    this.selectedFile=event.target.files[0];
    console.log(JSON.stringify(this.selectedFile));
  }
addMenu()
{
  // this.ms.addMenu(this.menuForm.value).subscribe((data)=>{
  //   console.log(data);
  // })
   const formData=new FormData();
   formData.append('id',this.menuForm.controls.id.value);
   formData.append('name',this.menuForm.controls.name.value);
   formData.append('price',this.menuForm.controls.price.value);
   formData.append('description',this.menuForm.controls.description.value);
   formData.append('picture',this.selectedFile);
   console.log(formData);
   this.ms.addMenu(formData).subscribe((data)=>{
       console.log(data);
})}
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

}
