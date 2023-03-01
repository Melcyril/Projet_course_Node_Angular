package fr.epsi.arras.tp.course.tpcourseapi.repository;


import fr.epsi.arras.tp.course.tpcourseapi.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter,Long> {
}
