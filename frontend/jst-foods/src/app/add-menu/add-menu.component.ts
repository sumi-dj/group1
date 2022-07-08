import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { AddmenuService } from '../addmenu.service';

@Component({
  selector: 'app-add-menu',
  templateUrl: './add-menu.component.html',
  styleUrls: ['./add-menu.component.css']
})
export class AddMenuComponent implements OnInit {
  addMenuForm:any;
  selectedFile:any;
  constructor(private fb:FormBuilder, private as:AddmenuService) { 
    this.addMenuForm=this.fb.group({
      description:[''],
      name:[''],
      picture:[],
      price:['']
     
    });
  }

  ngOnInit(): void {
  }

  fnChange(event:any)
  {
    this.selectedFile=event.target.files[0];
    console.log(JSON.stringify(this.selectedFile));
  }

  fnAdd()
  {
    alert('hi menu is added')
    var menu=new FormData();
    menu.append('description',this.addMenuForm.controls.description.value)
    menu.append('name',this.addMenuForm.controls.name.value)
    menu.append('picture',this.selectedFile, this.selectedFile.name)
    menu.append('price',this.addMenuForm.controls.price.value);
   
  

    console.log(menu);
    
    this.as.fnAddMenu(menu).subscribe((data)=>{
      console.log(data);
    },(error)=>{
      console.log(error);
      
    });
  }
}
