package com.homeautomation.webserver.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class ApplicationUser {

    @Id
    private String id;
    private String username;
    private String password;

    public String getUsername(){
        return username;
    }

    public void setName(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getId(){
        return id;
    }
}