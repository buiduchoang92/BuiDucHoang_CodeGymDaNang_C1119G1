import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  private loginForm: FormGroup;
  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.loginForm = this.fb.group( {
      email: ['' , [Validators.required, Validators.email]],
      password: ['' , [Validators.required, Validators.minLength(6)]]
    });
    this.loginForm .patchValue({
      email: 'hoang92duc@gmail.com'
    });
  }
  onSubmit() {
    console.log(this.loginForm);
  }
}
