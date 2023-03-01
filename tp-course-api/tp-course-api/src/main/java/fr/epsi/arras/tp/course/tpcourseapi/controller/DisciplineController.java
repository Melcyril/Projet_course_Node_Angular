package fr.epsi.arras.tp.course.tpcourseapi.controller;


import fr.epsi.arras.tp.course.tpcourseapi.entity.Chapter;
import fr.epsi.arras.tp.course.tpcourseapi.entity.Course;
import fr.epsi.arras.tp.course.tpcourseapi.entity.Discipline;
import fr.epsi.arras.tp.course.tpcourseapi.repository.DisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DisciplineController {
    @Autowired
    private DisciplineRepository disciplineRepository;
    @RequestMapping(method= RequestMethod.GET,value = "/v1/disciplines",produces = "application/json")
    public List<Discipline> getDisciplines(){
        return disciplineRepository.findAll();
    }
    @RequestMapping(method= RequestMethod.GET,value = "v1/disciplines/{id}",produces = "application/json")
    public Discipline getDiscipline(@PathVariable(value ="id") Long id){
        return disciplineRepository.findById(id).orElseThrow();
    }
    @RequestMapping(
            method= RequestMethod.POST,
            value="/v1/disciplines/create",
            produces ="application/json",
            consumes = "application/json"
    )
    public Discipline createDiscipline(@RequestBody Discipline discipline){
        return disciplineRepository.save(discipline);
    }
}
