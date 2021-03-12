import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-interviewer',
  templateUrl: './interviewer.component.html',
  styleUrls: ['./interviewer.component.css']
})
export class InterviewerComponent implements OnInit {

  
  data$ = this.http.get<any[]>("/api/interviews");
  constructor(private http:HttpClient) { }

  ngOnInit(): void {
  }

}
