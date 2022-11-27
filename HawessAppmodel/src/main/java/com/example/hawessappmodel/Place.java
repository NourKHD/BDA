package com.example.hawessappmodel;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Place {
    private int id;
    private String name;
    private String description;
    private Date createdAt;
    private Address address;
    private Set<Visit> rvisit;
    private Set<Photo> rphoto;
    public Place(){
        rvisit = new HashSet<Visit>();
        rphoto = new HashSet<Photo>();
    }
    public Place(int id,String name,String description, Date createdAt){
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.createdAt = createdAt;
        rvisit = new HashSet<Visit>();
        rphoto = new HashSet<Photo>();
    }
    //getters et setters


    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    //association entre Place et address
    public void addAddress(Address Adr){
        if(Adr != null){
            this.address = Adr;
        }
    }

    //association entre Place et Photo

    public void addPlacePhoto(Photo ph){
        if (!getRPhoto().contains(ph)){
            getRPhoto().add(ph);
        }
    }
    public void removePhoto(Photo ph){
        if (getRPhoto().contains(ph)){
            getRPhoto().remove(ph);
        }
    }

    public Set<Photo> getRPhoto() {

        return rphoto;
    }

    public void setPhoto(Set<Photo> ph) {

        this.rphoto = ph;
    }

    //classe association visit entre tourist place
    public void addPlaceVisit(Visit v){
        if (!getRVisit().contains(v)){
            if(v.getRPlace() != null){
                v.removePlace();
            }
            v.setRPlace(this);
            getRVisit().add(v);
        }
    }
    public void removeVisit(Visit v){
        if (getRVisit().contains(v)){
            getRVisit().remove(v);
            v.setRPlace(null);
        }
    }

    public Set<Visit> getRVisit() {
        return rvisit;
    }

    public void setRVisit(Set<Visit> visit) {
        this.rvisit = visit;
    }

    public Address getAddress() {
        return address;
    }

}
