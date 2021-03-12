import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-candidate',
  templateUrl: './candidate.component.html',
  styleUrls: ['./candidate.component.css']
})
export class CandidateComponent implements OnInit {

  data$ = this.http.get<any[]>("/api/admin/candidates");
  dataj$ = this.http.get<any[]>("/api/candidate/jobs");
  constructor(private http:HttpClient) { }

  ngOnInit(): void {
  }

}
