import { Injectable } from '@angular/core';
import { Course } from '../Course';
import { COURSES } from './course-mock';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  constructor() { }
  getCourseList():Course[]{
    return COURSES;
  }
  getCourseById(courseId: Number):Course|undefined{
      // Le + parse en numerique
    return COURSES.find(course=>course.id== +courseId)
  }
  getDisciplineList():Array<string>{
    return[
      "Gestion de Projet",
      "Developpement"
    ]
  }
}
