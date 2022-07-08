import { Component, OnInit } from '@angular/core';
declare var $: any; // declaring jquery in this way solved the problem

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  
  constructor() { }

  ngOnInit(): void {

  
  }

}