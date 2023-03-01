package fr.epsi.arras.tp.course.tpcourseapi.controller;


import fr.epsi.arras.tp.course.tpcourseapi.entity.Chapter;
import fr.epsi.arras.tp.course.tpcourseapi.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChapterController {
    @Autowired
    private ChapterRepository chapterRepository;
    @RequestMapping(method= RequestMethod.GET,value = "/v1/chapters",produces = "application/json")
    public List<Chapter> getChapter(){
        return chapterRepository.findAll();
    }

    @RequestMapping(method= RequestMethod.GET,value = "v1/chapters/{id}",produces = "application/json")
    public Chapter getChapter(@PathVariable(value ="id") Long id){
        return chapterRepository.findById(id).orElseThrow();
    }

    @RequestMapping(
            method= RequestMethod.POST,
            value="/v1/chapters/create",
            produces ="application/json",
            consumes = "application/json"
    )
    public Chapter createCourse(@RequestBody Chapter chapter){
        return chapterRepository.save(chapter);
    }
    @RequestMapping(
            method= RequestMethod.PUT,
            value="/v1/chapters/modify/{id}",
            produces ="application/json",
            consumes = "application/json"
    )
    public Chapter modifyChapter(@PathVariable Long id,@RequestBody Chapter chapter){
        Chapter theChapter=chapterRepository.findById(id).orElseThrow();
        if(chapter.getContent()!=null){
            theChapter.setContent(chapter.getContent());
        }
        if(chapter.getTitle()!=null){
            theChapter.setTitle(chapter.getTitle());
        }
        if(chapter.getCourse()!=null){
            theChapter.setCourse(chapter.getCourse());
        }
        return chapterRepository.save(theChapter);
    }

    @RequestMapping(method =RequestMethod.DELETE,value="/v1/chapters/delete/{id}")
    public void deleteChapter(@PathVariable Long id){
        Chapter chapter=chapterRepository.findById(id).orElseThrow();
        if(chapter.getId()!=null){
            chapterRepository.delete(chapter);
        }
    }
}
