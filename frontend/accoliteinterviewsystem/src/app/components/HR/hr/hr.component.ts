import { Component, OnInit, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-hr',
  templateUrl: './hr.component.html',
  styleUrls: ['./hr.component.css']
})
export class HrComponent implements OnInit {

  InterviewFormGroup = new FormGroup({
    interview_id: new FormControl('',Validators.required),
    candidate_name : new FormControl('', Validators.required),
    interviewer_name : new FormControl('', Validators.required),
    hr_id : new FormControl('', Validators.required),
    gmeetlink : new FormControl('', Validators.required),
    date: new FormControl('', Validators.required),
  });

  
  Submit(){
    this.http.post("/api/addinterview", this.InterviewFormGroup.value).subscribe();
  }

  data$ = this.http.get<any[]>("/api/admin/interviewers");
  dataC$ = this.http.get<any[]>("/api/admin/candidates");
  dataI$ = this.http.get<any[]>("/api/interviews");
  constructor(private http: HttpClient, private router: Router) {  }

  ngOnInit(): void {
  }

}
