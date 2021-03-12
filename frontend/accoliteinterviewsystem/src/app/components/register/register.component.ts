import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  RegisterFormGroup = new FormGroup({
    id : new FormControl('', Validators.required),
    name : new FormControl('', Validators.required),
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', Validators.required),
    type: new FormControl('', Validators.required),
    resume_link: new FormControl('', Validators.required)
  }); 

  Submit(){
    this.http.post("/api/admin/adduser", this.RegisterFormGroup.value).subscribe(() => this.router.navigate(["/candidate"]));
  }
  constructor(private http:HttpClient, private router:Router ) { }

  ngOnInit(): void {
  }

}