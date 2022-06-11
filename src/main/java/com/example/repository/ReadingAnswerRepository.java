package com.example.repository;


import com.example.model.ReadingAnswer;
import com.example.model.ReadingQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReadingAnswerRepository extends JpaRepository<ReadingAnswer, String> {
    @Query(value = "SELECT * FROM readinganswer WHERE readingquestionid = ?1", nativeQuery = true)
    List<ReadingAnswer> getReadingAnswerByReadingQuestion(String id);

    @Query(value = "SELECT * FROM readinganswer WHERE readingquestionid = ?1 AND iscorrect = true", nativeQuery = true)
    List<ReadingAnswer> getCorrectReadingAnswerByReadingQuestion(String id);
}
