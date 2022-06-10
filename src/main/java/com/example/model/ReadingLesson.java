package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "readinglesson")
public class ReadingLesson {
    private String uuid;
    private String title;
    private int duration;

    public ReadingLesson() {

    }

    public ReadingLesson(String uuid, String title, int duration) {
        this.uuid = uuid;
        this.title = title;
        this.duration = duration;
    }


    @Id
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }



}
