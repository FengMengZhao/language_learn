package org.fmz.jdbc;

public class Users{

    private int uid;
    private String username;
    private String password;

    public void setUid(int uid){
        this.uid = uid;
    }

    public int getUid(){
        return uid;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }
}
