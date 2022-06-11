package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "readingquestion")
public class ReadingQuestion {
    private String uuid;
    private String readingLessonUuid;
    private String content;

    public ReadingQuestion() {

    }

    public ReadingQuestion(String uuid, String readingLessonUuid, String content) {
        this.uuid = uuid;
        this.readingLessonUuid = readingLessonUuid;
        this.content = content;
    }

    @Id
    public String getId() {
        return uuid;
    }

    public void setId(String uuid) {
        this.uuid = uuid;
    }

    @Column(name = "readinglessonid")
    public String getReadingLessonUuid() {
        return readingLessonUuid;
    }

    @Column(name = "readinglessonid")
    public void setReadingLessonUuid(String readingLessonUuid) {
        this.readingLessonUuid = readingLessonUuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
