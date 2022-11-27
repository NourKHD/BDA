package com.example.hawessappmodel;

import java.util.Date;

public class Photo {
    private int id;
    private String photoFilePath;
    private Date cratedAt;

    public Photo(int id, String photoFilePath, Date cratedAt) {
        this.id = id;
        this.photoFilePath = photoFilePath;
        this.cratedAt = cratedAt;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhotoFilePath() {
        return photoFilePath;
    }

    public void setPhotoFilePath(String photoFilePath) {
        this.photoFilePath = photoFilePath;
    }
    public Date getCratedAt() {
        return cratedAt;
    }

    public void setCratedAt(Date cratedAt) {
        this.cratedAt = cratedAt;
    }
}
