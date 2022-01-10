import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login-register',
  templateUrl: './login-register.component.html',
  styleUrls: ['./login-register.component.css']
})
export class LoginRegisterComponent implements OnInit {

/*for validation of inputs*/
  emailPattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$"

  constructor() { }
/*for hiding/unhiding elements*/
  toggleOn:boolean = true;

  ngOnInit() {
this.toggleOn = true;

  }

}


