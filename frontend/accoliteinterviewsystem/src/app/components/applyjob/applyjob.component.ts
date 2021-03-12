import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-applyjob',
  templateUrl: './applyjob.component.html',
  styleUrls: ['./applyjob.component.css']
})
export class ApplyjobComponent implements OnInit {
  data$ = this.http.get<any[]>("/api/jobs");

  ApplyJobFormGroup = new FormGroup({
    jobid : new FormControl('', Validators.required),
    candidateid : new FormControl('', Validators.required),
    title : new FormControl('', Validators.required)
  }); 

  Submit(){
    this.http.post("/api/candidate/applyjob", this.ApplyJobFormGroup.value).subscribe(() => this.router.navigate(["/candidate"]));
  }


  constructor(private http: HttpClient,private router:Router) { }


  ngOnInit(): void {
  }

}
