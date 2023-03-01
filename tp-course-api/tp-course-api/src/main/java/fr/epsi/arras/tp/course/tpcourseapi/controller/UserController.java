package fr.epsi.arras.tp.course.tpcourseapi.controller;

import fr.epsi.arras.tp.course.tpcourseapi.entity.Chapter;
import fr.epsi.arras.tp.course.tpcourseapi.entity.Course;
import fr.epsi.arras.tp.course.tpcourseapi.entity.User;
import fr.epsi.arras.tp.course.tpcourseapi.repository.CourseRepository;
import fr.epsi.arras.tp.course.tpcourseapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping(method= RequestMethod.GET,value = "/v1/users",produces = "application/json")
    public List<User> getUsers(){

        return userRepository.findAll();
    }

    @RequestMapping(method= RequestMethod.GET,value = "v1/users/{id}",produces = "application/json")
    public User getUser(@PathVariable(value ="id") Long id){
        return userRepository.findById(id).orElseThrow();
    }

    @RequestMapping(
            method= RequestMethod.POST,
            value="/v1/users/create",
            produces ="application/json",
            consumes = "application/json"
    )
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @DeleteMapping("/v1/users/delete/{id}")
    public ResponseEntity<HttpStatus> deleteuser(@PathVariable("id") long id) {
        userRepository.deleteById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
