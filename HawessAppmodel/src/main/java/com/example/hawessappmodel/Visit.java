package com.example.hawessappmodel;

import java.util.Date;

public class Visit {
    private String photoFilePath;
    private String comment;
    private int vote;
    private Date cratedAt;
    private Tourist tourist;
    private Place place;

    public Visit(String photoFilePath, int vote,String comment, Date cratedAt,Tourist t,Place p) {
        this.photoFilePath = photoFilePath;
        this.vote = vote;
        this.comment = comment;
        this.cratedAt = cratedAt;
        this.tourist = t;
        this.place = p;
    }

    //getters ans setters

    public String getPhotoFilePath() {
        return photoFilePath;
    }

    public void setPhotoFilePath(String photoFilePath) {
        this.photoFilePath = photoFilePath;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public Date getCratedAt() {
        return cratedAt;
    }

    public void setCratedAt(Date cratedAt) {
        this.cratedAt = cratedAt;
    }

    //les associations avec Tourist et Place

    public void addTourist(Tourist t){
        if(!t.getRVisit().contains(this)){
            if (getRTourist()!=null){
                t.removeVisit(this);
            }
            setRTourist(t);
            t.addTouristVisit(this);
        }
    }

    public void addVisitPlace(Place p){
        if(!p.getRVisit().contains(this)){
            if (getRPlace()!=null){
                p.removeVisit(this);
            }
            setRPlace(p);
            p.addPlaceVisit(this);
        }
    }

    public Tourist getRTourist() {
        return tourist;
    }
    public void setRTourist(Tourist tourist) {
        this.tourist = tourist;
    }
    public Place getRPlace() {
        return place;
    }
    public void setRPlace(Place p) {
        this.place = p;
    }
    public void removeTourist(){
        getRTourist().removeVisit(this);
        setRTourist(null);
    }
    public void removePlace(){
        getRPlace().removeVisit(this);
        setRPlace(null);
    }

}

