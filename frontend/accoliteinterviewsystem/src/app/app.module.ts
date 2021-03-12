import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule, routingComponents} from './app-routing.module';
import { ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { AdminComponent } from './components/Admin/admin/admin.component';
import { AddComponent } from './components/Admin/add/add.component';
import { ShowComponent } from './components/Admin/show/show.component';
import { RegisterComponent } from './components/register/register.component';
import {HttpClientModule} from '@angular/common/http';
import { CandidateComponent } from './components/Candidate/candidate/candidate.component';
import { HrComponent } from './components/HR/hr/hr.component';
import {InterviewerComponent} from "./components/Interviewer/interviewer/interviewer.component";
import { AddjobComponent } from './components/HR/addjob/addjob.component';
import { ShowjobsComponent } from './components/HR/showjobs/showjobs.component';
import { ApplyjobComponent } from './components/applyjob/applyjob.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    routingComponents,
    AdminComponent,
    AddComponent,
    ShowComponent,
    RegisterComponent,
    CandidateComponent,
    HrComponent,
    InterviewerComponent,
    AddjobComponent,
    ShowjobsComponent,
    ApplyjobComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
