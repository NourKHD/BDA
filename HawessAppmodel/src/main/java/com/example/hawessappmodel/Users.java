package com.example.hawessappmodel;

import java.util.Date;
import java.util.Objects;

public abstract class Users {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Date birthDate;
    private String password;

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //methods

    public void resetPassword(String old, String newpass){
        if (old == getPassword()) {
            old = this.password;
            this.password = newpass;
        }
    }
    public boolean equals(Object obj) {
        return this.id == ((Users)obj).id;
    }

}
