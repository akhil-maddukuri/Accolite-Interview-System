import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-addjob',
  templateUrl: './addjob.component.html',
  styleUrls: ['./addjob.component.css']
})
export class AddjobComponent implements OnInit {
  JobFormGroup = new FormGroup({
    id: new FormControl('', Validators.required),
    title: new FormControl('', Validators.required),
    description: new FormControl('', Validators.required),
    location: new FormControl('', Validators.required),
    eligibility: new FormControl('', Validators.required),
  })

  job:any;
  
  Submit(){
     this.http.post("/api/hr/addjob", this.JobFormGroup.value).subscribe(() => this.router.navigate(["/hr/showjobs"]));
   }
//   Submit(val: { jobid: any; jobtitle: any; jobdescription: any; location: any; eligibility: any;}){
//     let jobid=val.jobid;
//     let jobtitle=val.jobtitle;
//     let jobdescription=val.jobdescription;
//     let location=val.location;
//     let eligibility=val.eligibility;
//     console.log(jobid+ " ," + jobtitle + " ," + jobdescription + " ," + location + " ," + eligibility);
//  }
  constructor(private http: HttpClient,private router:Router,private route: ActivatedRoute) { }
  ngOnInit(): void {
  // this.job = JSON.parse(this.route.snapshot.params['job']);
  // console.log(this.job + "Job from add Jobs");
  // this.JobFormGroup =({
  //   id : new FormControl(this.job?.id, Validators.required),
  //   title : new FormControl(this.job?.title, Validators.required),
  //   description : new FormControl(this.job?.description, Validators.required),
  //   location: new FormControl(this.job?.location, Validators.required),
  //   eligibility : new FormControl(this.job?.eligibility, Validators.required),
  //}); 
  }

}
