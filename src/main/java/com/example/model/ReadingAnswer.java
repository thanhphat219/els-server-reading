package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "readinganswer")
public class ReadingAnswer {
    private String uuid;
    private String readingQuestionUuid;
    private String answer;
    private boolean isCorrect;


    public ReadingAnswer() {

    }

    public ReadingAnswer(String uuid, String readingQuestionUuid, String answer, boolean isCorrect) {
        this.uuid = uuid;
        this.readingQuestionUuid = readingQuestionUuid;
        this.answer = answer;
        this.isCorrect = isCorrect;
    }

    @Id
    public String getId() {
        return uuid;
    }

    public void setId(String uuid) {
        this.uuid = uuid;
    }

    @Column(name = "readingquestionid")
    public String getReadingQuestionUuid() {
        return readingQuestionUuid;
    }

    @Column(name = "readingquestionid")
    public void setReadingQuestionUuid(String readingQuestionUuid) {
        this.readingQuestionUuid = readingQuestionUuid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Column(name = "iscorrect")
    public boolean isCorrect() {
        return isCorrect;
    }

    @Column(name = "iscorrect")
    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }


}
