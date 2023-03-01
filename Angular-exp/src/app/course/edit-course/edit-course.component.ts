import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Course } from 'src/app/Course';
import { CourseService } from '../course.service';

@Component({
  selector: 'app-edit-course',
  template: `
<h2>Modifier les cours {{course?.title}}</h2>
<app-course-form *ngIf="course" [course]="course"></app-course-form>
  `,
  styles: [
  ]
})
export class EditCourseComponent implements OnInit {
  course: Course|undefined;
  constructor(
    private route:ActivatedRoute,
    private courseService: CourseService
  ) { }

  ngOnInit(): void {
    const courseId=this.route.snapshot.paramMap.get("id");
    if(courseId){
      this.course=this.courseService.getCourseById(+courseId);
    }
  }

}
