import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Course } from '../../Course';
import { COURSES } from '../course-mock';
import { CourseService } from '../course.service';

@Component({
  selector: 'app-detail-course',
  templateUrl: 'detail-course.component.html',
})
export class DetailCourseComponent implements OnInit {
// recupère la route activatedroute
courseList:Course[];
course:Course|undefined;
  constructor(
    private route: ActivatedRoute,
    private router:Router,
    private courseService:CourseService) { }


  retour(){
    this.router.navigate(['/courses']);
  }
  goToCourseEdit(course:Course){
    this.router.navigate(['/courses', course.id,'edit'])
  }
  ngOnInit(): void {

    this.courseList=COURSES;  
    const courseId= this.route.snapshot.paramMap.get('id');
    if(courseId){
      // Le + parse en numerique
      this.course=this.courseService.getCourseById(+courseId);    
    }
  }


}
