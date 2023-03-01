import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListCourseComponent } from './list-course/list-course.component';
import { DetailCourseComponent } from './detail-course/detail-course.component';
import { BorderCardDirective } from './border-card.directive';
import { CourseDisciplineColorPipe } from './course-discipline-color.pipe';
import { RouterModule, Routes } from '@angular/router';
import { BoxShadowCardDirective } from './box-shadow-card.directive';
import { CourseFormComponent } from './course-form/course-form.component';
import { EditCourseComponent } from './edit-course/edit-course.component';
import { FormsModule } from '@angular/forms';

const routes:Routes=[
  {path: 'courses', component:ListCourseComponent},
  {path: 'courses/:id',component:DetailCourseComponent},
  {path: 'courses/:id/edit',component:EditCourseComponent}
]

@NgModule({
  declarations: [
    ListCourseComponent,
    DetailCourseComponent,
    BorderCardDirective,
    CourseDisciplineColorPipe,
    BoxShadowCardDirective,
    CourseFormComponent,
    EditCourseComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    RouterModule.forChild(routes)
  ]
})
export class CourseModule { }
