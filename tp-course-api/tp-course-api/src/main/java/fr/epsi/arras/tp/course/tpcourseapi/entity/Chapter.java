package fr.epsi.arras.tp.course.tpcourseapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="Chapters")
public class Chapter {
    private String title;
    private String Content;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name ="id_course", referencedColumnName = "id")
    @JsonIgnoreProperties(value={"chapters"})
    private Course course;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Course getCourse(){
        return this.course;
    }
    public void setCourse(Course course){
        this.course=course;
    }

}
