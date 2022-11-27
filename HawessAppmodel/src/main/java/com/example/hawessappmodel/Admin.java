package com.example.hawessappmodel;

import java.util.Date;

public class Admin extends Users{
    private int phoneNumber;
    private String affiliation;
    private String ipAddress;

    public Admin(int id, String firstName, String lastName, String email, Date birthDate, String password, int phoneNumber, String affiliation,String ipAddress){
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setBirthDate(birthDate);
        this.setPassword(password);
        this.setPhoneNumber(phoneNumber);
        this.setAffiliation(affiliation);
        this.setIpAddress(ipAddress);
    }
    //getters and setters
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    //methods

    public void addPlace(){

    }
    public void updatePlace(){

    }
    public void deletePlace(){

    }


}
