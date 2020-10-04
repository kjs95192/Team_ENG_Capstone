package com.hobbyroute.model;

public class UserData {
    private String id;
    private String pw;
    private static UserData instance = null;

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

    public static synchronized UserData getInstance(){
        if(instance == null){
            instance = new UserData();
        }
        return instance;
    }
}
