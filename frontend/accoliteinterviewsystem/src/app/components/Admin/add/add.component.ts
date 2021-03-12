import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
 
  EmpFormGroup = new FormGroup({
    id : new FormControl('', Validators.required),
    name : new FormControl('', Validators.required),
    type : new FormControl('', Validators.required),
    dob: new FormControl('', Validators.required),
    gender : new FormControl('', Validators.required),
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', Validators.required,)
  }); 

  Submit(){
    this.http.post("/api/admin/adduser", this.EmpFormGroup.value).subscribe(() => this.router.navigate(["/admin/show"]));
  }


  constructor(private http: HttpClient,private router:Router) { }

  ngOnInit(): void {
  }

}