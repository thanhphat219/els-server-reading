package com.example.repository;

import com.example.model.ReadingLesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadingLessonRepository extends JpaRepository<ReadingLesson, String> {

}
