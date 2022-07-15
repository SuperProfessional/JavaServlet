package com.example.javaservlet.model;

import java.util.Date;

public class Staff {
    private String name;
    private Date birthday;
    private boolean gender;
    private String country;
    private boolean married;
    private String[] hobbies;
    private String notes;

    public Staff() {
    }

    public Staff(String name, Date birthday, boolean gender, String country, boolean married, String[] hobbies, String notes) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.country = country;
        this.married = married;
        this.hobbies = hobbies;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
