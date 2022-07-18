package com.example.javaservlet.model.lab03;


import java.io.File;

public class StaffChild extends Staff{
    private File photo;
    public StaffChild(){
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return  "StaffChild{" + super.toString() +
                "photo='" + photo + '\'' +
                '}';
    }
}
