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

    $(document).ready(function() {

      $("#mentor-card").hover(function() {
          $("#show-mntr-rating").slideToggle(500);
  
      });
      $("#xplorebtn").click(function() {
        window.location.href = ("menu");
    });
    $("#xplorebtn1").click(function() {
      window.location.href = ("menu");
  });
  $("#xplorebtn2").click(function() {
    window.location.href = ("menu");
});
  
  });
    
  }

}
