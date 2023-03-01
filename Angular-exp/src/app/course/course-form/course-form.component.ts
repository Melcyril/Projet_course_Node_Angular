import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Course } from 'src/app/Course';
import { CourseService } from '../course.service';

@Component({
  selector: 'app-course-form',
  templateUrl: './course-form.component.html',
  styleUrls: [
    './course-form.component.css'
  ]
})
export class CourseFormComponent implements OnInit {
  disciplineList: Array<string>
  @Input() course:Course;
  constructor(
    private courseService:CourseService,
    private router:Router
  ) { }

  ngOnInit(): void {
    this.disciplineList=this.courseService.getDisciplineList();
  }
  hasDiscipline(discipline:string){
    return this.course.discipline==discipline;
  }

  selectDiscipline($event: Event,discipline:string){
    const isChecked= ($event.target as HTMLInputElement).checked;
    if(isChecked){
      this.course.discipline=discipline;
    }else{
      this.course.discipline="";
    }
   
  }
  onSubmit(){
    console.log("SUBMIT !");
    this.router.navigate(['/courses',this.course.id]);
  }
  isDisciplineValid(discipline:string):boolean{
    if(this.course.discipline){
      return false;
    }
    return true
  }
}
