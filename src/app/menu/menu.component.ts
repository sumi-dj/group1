import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { FoodService } from '../food.service';
import { MenuService } from '../menu.service';
import { Foods } from '../shared/models/food';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  foods:Foods[]=[];
  constructor( private fs:FoodService) { 
 }
  ngOnInit(): void {
    this.foods = this.fs.getAll()
   
  }
 
  }
