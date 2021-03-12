import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
@Component({
  selector: 'app-show',
  templateUrl: './show.component.html',
  styleUrls: ['./show.component.css']
})
export class ShowComponent implements OnInit {

  data$ = this.http.get<any[]>("/api/admin/users");

 
  constructor(private http:HttpClient ,private router:Router) { }

  ngOnInit(): void {

  }

  del(id :string){
     this.http.delete<any>("/api/admin/users/" + id).subscribe(() => this.router.navigate(["/admin/show"]));
  }

}
