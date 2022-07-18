package com.example.javaservlet.model.lab03;

public class User {
    private String username;
    private String password;
    private boolean remember;

    public User() {
    }

    public User(String username, String password, boolean remenber) {
        this.username = username;
        this.password = password;
        this.remember = remenber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remenber) {
        this.remember = remenber;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", remenber=" + remember +
                '}';
    }
}
