package com.singapore.unlocked.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class UserModel {
    @Id
    private int id;

    private String email;
    private String username;
    private String password;

    public int getId() {
    	return this.id;
    }
    public void setId(int id) {
    	this.id = id;
    }


    public String getEmail() {
    	return this.email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }


    public String getUsername() {
    	return this.username;
    }
    public void setUsername(String username) {
    	this.username = username;
    }


    public String getPassword() {
    	return this.password;
    }
    public void setPassword(String password) {
    	this.password = password;
    }

    
    public UserModel(int id, String email, String username, String password) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    


}
