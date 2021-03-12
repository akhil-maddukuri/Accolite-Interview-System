import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import {AdminComponent} from './components/Admin/admin/admin.component';
import { AddComponent } from './components/Admin/add/add.component';
import { ShowComponent } from './components/Admin/show/show.component';
import { RegisterComponent } from './components/register/register.component';
import { CandidateComponent } from './components/Candidate/candidate/candidate.component';
import { HrComponent } from './components/HR/hr/hr.component';
import { AddjobComponent } from './components/HR/addjob/addjob.component';
import { ShowjobsComponent } from './components/HR/showjobs/showjobs.component';
import { InterviewerComponent } from './components/Interviewer/interviewer/interviewer.component';
import { ApplyjobComponent } from './components/applyjob/applyjob.component';


const routes: Routes = [
  {path: "", redirectTo: "home", pathMatch: 'full'},
  {path: "home", component:HomeComponent},
  {path:"login", component: LoginComponent},
  {path:"register", component: RegisterComponent},
  {path:"applyjob",component:ApplyjobComponent},
  {path:"admin",component:AdminComponent},
  {path:"admin/add",component:AddComponent},
  {path:"admin/show",component:ShowComponent},
  {path:"candidate",component:CandidateComponent},
  {path:"hr",component:HrComponent},
  {path:"hr/addjob",component:AddjobComponent},
  {path:"hr/showjobs",component:ShowjobsComponent},
  {path:"interviewer",component:InterviewerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingComponents = [HomeComponent,LoginComponent,AdminComponent,AddComponent,ShowComponent,HrComponent,AddjobComponent,ShowjobsComponent,ApplyjobComponent]
