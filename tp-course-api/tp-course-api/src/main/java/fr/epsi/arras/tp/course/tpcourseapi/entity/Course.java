package fr.epsi.arras.tp.course.tpcourseapi.entity;



import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="courses")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property ="id")
public class Course {
    @Column(nullable = false)
    private String name;
    private String description;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "course", fetch=FetchType.LAZY)
    private List<Chapter> chapters;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id_discipline")
    private Discipline discipline;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id_user")
    private User user;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }
}
