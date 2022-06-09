package com.example.controller;

import com.example.model.ReadingLesson;
import com.example.repository.ReadingLessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ReadingLessonController {
    @Autowired
    private ReadingLessonRepository readingLessonRepository;

    @GetMapping("/readinglesson")
    public List<ReadingLesson> getAllListening() {
        return readingLessonRepository.findAll();
    }
}
