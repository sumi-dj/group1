import { Injectable } from '@angular/core';
import { NonVegFoods, VegFoods } from './shared/models/food';
import { Starters } from './shared/models/food';
import {Desserts } from './shared/models/food';

@Injectable({
  providedIn: 'root'
})
export class FoodService {

  constructor() { }

  getAllNonveg():NonVegFoods[]{
    return [
      {imageUrl:'assets/image/nonVegItems/Chettinad_Chicken_biryani.jpg',
    name :'Chettinad Chicken biryani',
    price:210,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/nonVegItems/ChickenGheeRoast.jpg',
    name :'Chicken GheeRoast',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/nonVegItems/chicken-65-gobi.jpg',
    name :'chicken65 Gobi',
    price:180,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/nonVegItems/Ghee Pepper Prawn.jpg',
    name :'Ghee Pepper Prawn',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/nonVegItems/Chicken-Kebab.jpg',
    name :'Chicken Kebab',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/nonVegItems/mughlai-chicken-korma-4-480x480.jpg',
    name :'Mughlai chicken',
    price:220,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/nonVegItems/tandoori-chicken.jpg',
    name :'Tandoori chicken',
    price:190,
  restaurant:'Habitat',},
   ]
  }


  // veg item here  //


  getAllVeg():VegFoods[]{
    return [
      {imageUrl:'assets/image/vegItems/aloo65.jpg',
    name :'aloo65',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/butterNaan.jpg',
  name :'butterNaan',
  price:220,
restaurant:'Habitat',},
{imageUrl:'assets/image/vegItems/mushroom-manchurian.jpg',
name :'mushroom manchurian',
price:180,
restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/KajuFry.jpg',
    name :'KajuFry',
    price:210,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/paneer-65-recipe-1.jpg',
    name :'paneer-65-recipe',
    price:190,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/spring-rolls-500x500.jpg',
    name :'spring-rolls',
    price:220,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/veg-manchurian-recipe.jpg',
    name :'veg-manchurian',
    price:250,
  restaurant:'Habitat',},
   ]
  }


  // starters hereee//

  
  getAllstarters():Starters[]{
    return [
      {imageUrl:'assets/image/vegItems/aloo65.jpg',
    name :'Biriyani',
    price:220,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/butterNaan.jpg',
  name :'butterNaan',
  price:200,
restaurant:'Habitat',},
{imageUrl:'assets/image/vegItems/mushroom-manchurian.jpg',
name :'mushroom-manchurian',
price:210,
restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/KajuFry.jpg',
    name :'KajuFry',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/paneer-65-recipe-1.jpg',
    name :'paneer-65',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/spring-rolls-500x500.jpg',
    name :'Biriyani',
    price:190,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/veg-manchurian-recipe.jpg',
    name :'veg-manchurian',
    price:200,
  restaurant:'Habitat',},
   ]
  }


  // desserts here ///

  
  getAlldesserts():Desserts[]{
    return [
      {imageUrl:'assets/image/vegItems/butterNaan.jpg',
    name :'Biriyani',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/aloo65.jpg',
  name :'Biriyani',
  price:200,
restaurant:'Habitat',},
{imageUrl:'assets/image/vegItems/mushroom-manchurian.jpg',
name :'Biriyani',
price:200,
restaurant:'Habitat',},
  {imageUrl:'assets/image/nonVegItems/fry-piece-biryani-at.jpg',
    name :'Biriyani',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/paneer-65-recipe-1.jpg',
    name :'Biriyani',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/vegItems/spring-rolls-500x500.jpg',
    name :'Biriyani',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/nonVegItems/Chicken-Kebab.jpg',
    name :'Biriyani',
    price:200,
  restaurant:'Habitat',},
   ]
  }
}
