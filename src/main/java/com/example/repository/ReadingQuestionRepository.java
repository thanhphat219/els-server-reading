package com.example.repository;

import com.example.model.ReadingQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReadingQuestionRepository extends JpaRepository<ReadingQuestion, String> {
    @Query(value = "SELECT rq FROM readingquestion rq WHERE rq.readinglessonid = ?1", nativeQuery = true)
    List<ReadingQuestion> getReadingQuestionByReadingLesson(String id);
}
