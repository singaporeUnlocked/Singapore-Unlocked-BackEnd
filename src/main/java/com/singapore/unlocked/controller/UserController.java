package com.singapore.unlocked.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.singapore.unlocked.model.UserModel;
import com.singapore.unlocked.repository.UserRepository;
@RestController
@RequestMapping("/api")
public class UserController {
    
    @Autowired
    UserRepository userRepo;

    @PostMapping("/login")
    public ResponseEntity<UserModel> findByEmail(String email, String password) {
        try{
            UserModel user = userRepo.findByEmail(email)

            if(user != null){
                if(user.getPassword() == password){
                    return user;
                }
            }
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
