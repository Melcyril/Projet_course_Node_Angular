package fr.epsi.arras.tp.course.tpcourseapi.repository;

import fr.epsi.arras.tp.course.tpcourseapi.entity.Course;
import fr.epsi.arras.tp.course.tpcourseapi.entity.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplineRepository extends JpaRepository<Discipline,Long> {

}
