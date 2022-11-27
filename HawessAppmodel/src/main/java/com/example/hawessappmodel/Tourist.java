package com.example.hawessappmodel;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Tourist extends Users{
    private int reputation;
    private String profilePhotoFile;
    private Set<Visit> rvisit;


    public Tourist(int id, String firstName, String lastName, String email, String password,Date birthDate,int reputation,String profilePhotoFile){
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPassword(password);
        this.setBirthDate(birthDate);
        this.setReputation(reputation);
        this.setProfilePhotoFile(profilePhotoFile);
        rvisit = new HashSet<Visit>();

    }

    public Tourist() { }

    //getters and setters

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public String getProfilePhotoFile() {
        return profilePhotoFile;
    }

    public void setProfilePhotoFile(String profilePhotoFile) {
        this.profilePhotoFile = profilePhotoFile;
    }
    //methods

    public void updateProfilePhoto(String photoFile){
        this.profilePhotoFile = photoFile;
    }
    public void visitPlace(Place place){

    }
    public int vote(Place place){
        for(Visit v :rvisit){
            if(v.getRPlace().getId() == place.getId()){
                return v.getVote();
            }
        }
        return 0;
    }
    public String comment(Place place){
        for(Visit v :rvisit){
            if(v.getRPlace().getId() == place.getId()){
                return v.getComment();
            }
        }
        return null;
    }
    //classe association visit entre tourist place
    public void addTouristVisit(Visit v){
        if (!getRVisit().contains(v)){
            if(v.getRTourist() != null){
                v.removeTourist();
            }
            v.setRTourist(this);
            getRVisit().add(v);
        }
    }
    public void removeVisit(Visit v){
        if (getRVisit().contains(v)){
            getRVisit().remove(v);
            v.setRTourist(null);
        }
    }

    public Set<Visit> getRVisit() {
        return rvisit;
    }

    public void setRVisit(Set<Visit> visit) {
        this.rvisit = visit;
    }


}
