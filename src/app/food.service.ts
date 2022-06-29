import { Injectable } from '@angular/core';
import { Foods } from './shared/models/food';
@Injectable({
  providedIn: 'root'
})
export class FoodService {

  constructor() { }

  getAll():Foods[]{
    return [
      {imageUrl:'assets/image/1.jpg',
    name :'Biriyani',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/1.jpg',
    name :'Biriyani',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/1.jpg',
    name :'Biriyani',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/1.jpg',
    name :'Biriyani',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/1.jpg',
    name :'Biriyani',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/1.jpg',
    name :'Biriyani',
    price:200,
  restaurant:'Habitat',},
  {imageUrl:'assets/image/1.jpg',
    name :'Biriyani',
    price:200,
  restaurant:'Habitat',},

 
 
    


    ]
  }
}
