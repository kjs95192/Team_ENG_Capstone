package com.example.hobbyroute.model;

public class User {
    private String id;
    private String pw;
    private static User instance = null;

    public void setUser(String id, String pw){
        this.id = id;
        this.pw = pw;
    }

    public String getId(){
        return id;
    }

    public String getPw(){
        return pw;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setPw(String pw){
        this.pw = pw;
    }

    public static synchronized User getInstance(){
        if(instance == null){
            instance = new User();
        }
        return instance;
    }
}
