import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { FoodService } from '../food.service';
import { MenuService } from '../menu.service';
import { Desserts, NonVegFoods, Starters, VegFoods } from '../shared/models/food';
@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  Nonvegfoods:NonVegFoods[]=[];
  Vegfoods:VegFoods[]=[];
  starters:Starters[]=[];
  desserts:Desserts[]=[];
  constructor( private fs:FoodService) { 
 }
  ngOnInit(): void {
    this.Nonvegfoods = this.fs.getAllNonveg()
   this.Vegfoods =this.fs.getAllVeg()
   this.starters =this.fs.getAllstarters()
   this.desserts =this.fs.getAlldesserts()
  }
 
  }
