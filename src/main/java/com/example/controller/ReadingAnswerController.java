package com.example.controller;

import com.example.model.ReadingAnswer;
import com.example.model.ReadingQuestion;
import com.example.repository.ReadingAnswerRepository;
import com.example.repository.ReadingQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ReadingAnswerController {
    @Autowired
    private ReadingAnswerRepository readingAnswerRepository;

    @GetMapping("/readinganswer")
    public List<ReadingAnswer> getAllListeningQuestion() {
        return readingAnswerRepository.findAll();
    }

    @GetMapping("/readinganswer/")
    public List<ReadingAnswer> getListeningQuestionByListeningLesson(@RequestParam String id) {
        return readingAnswerRepository.getReadingAnswerByReadingQuestion(id);
    }

    @GetMapping("/readinganswercorrect/")
    public List<ReadingAnswer> getCorrectReadingAnswerByReadingQuestion(@RequestParam String id) {
        return readingAnswerRepository.getCorrectReadingAnswerByReadingQuestion(id);
    }
}
