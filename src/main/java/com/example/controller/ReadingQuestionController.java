package com.example.controller;

import com.example.model.ReadingQuestion;
import com.example.repository.ReadingQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ReadingQuestionController {
    @Autowired
    private ReadingQuestionRepository readingQuestionRepository;

    @GetMapping("/readingquestion")
    public List<ReadingQuestion> getAllListeningQuestion() {
        return readingQuestionRepository.findAll();
    }

    @GetMapping("/readingquestion/")
    public List<ReadingQuestion> getListeningQuestionByListeningLesson(@RequestParam String id) {
        return readingQuestionRepository.getReadingQuestionByReadingLesson(id);
    }
}
