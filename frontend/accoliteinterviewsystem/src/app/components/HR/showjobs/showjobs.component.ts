import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-showjobs',
  templateUrl: './showjobs.component.html',
  styleUrls: ['./showjobs.component.css']
})
export class ShowjobsComponent implements OnInit {
  data$ = this.http.get<any[]>("/api/jobs");


  del(id :string){
    this.http.delete<any>("/api/hr/jobs/" + id).subscribe(() => this.router.navigate(["/hr/showjobs"]));
 }
  constructor(private http:HttpClient, private route: ActivatedRoute, private router: Router) {

   }
  ngOnInit(): void {

  }

  // updatejob(job: any)
  // {
  //   // const data = {
  //   //   job:job
  //   // }
  //   console.log(job + "from show jobs");
  //   this.router.navigate(["hr/addjob",{  job : JSON.stringify(job) }])
    
  // }

}
