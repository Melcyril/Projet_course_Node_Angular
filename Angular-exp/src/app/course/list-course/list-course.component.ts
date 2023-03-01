import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Course } from '../../Course';
import { CourseService } from '../course.service';
@Component({
  selector: 'app-list-course',
  templateUrl:'list-course.component.html',
})
export class ListCourseComponent implements OnInit {
  coursesList: Course[];
  course:Course|undefined;
  constructor(private router:Router,private courseService:CourseService) { }

  ngOnInit(): void {
    this.coursesList=this.courseService.getCourseList();
  }
  selectedCourse(course:Course){
    console.log(course.title);
  }
  goToDetailCourse(courseId: number){
    this.router.navigate(['/courses',courseId]);
  }
  
}
