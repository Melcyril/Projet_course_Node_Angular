package fr.epsi.arras.tp.course.tpcourseapi.controller;

import fr.epsi.arras.tp.course.tpcourseapi.entity.Chapter;
import fr.epsi.arras.tp.course.tpcourseapi.entity.Course;
import fr.epsi.arras.tp.course.tpcourseapi.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @RequestMapping(method= RequestMethod.GET,value = "/v1/courses",produces = "application/json")
    public List<Course> getCourse(){
        return courseRepository.findAll();
    }

    @RequestMapping(method= RequestMethod.GET,value = "v1/courses/{id}",produces = "application/json")
    public Course getCourse(@PathVariable(value ="id") Long id){
        return courseRepository.findById(id).orElseThrow();
    }

    @RequestMapping(
            method= RequestMethod.POST,
            value="/v1/courses/create",
            produces ="application/json",
            consumes = "application/json"
    )
    public Course createCourse(@RequestBody Course course){
        return courseRepository.save(course);
    }
}
