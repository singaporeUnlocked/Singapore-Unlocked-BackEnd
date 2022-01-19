package com.singapore.unlocked.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.attribute.UserPrincipal;
import java.util.List;
import java.util.Optional;

import com.singapore.unlocked.model.PatientModel;
import com.singapore.unlocked.model.UserModel;
import com.singapore.unlocked.repository.PatientRepository;
import com.singapore.unlocked.repository.UserRepository;


@RestController
public class UserController
{
    @Autowired
    UserRepository userRepo;
    @Autowired
    PatientRepository patientRepo;


    @GetMapping("/findAllUsers")
    public List<UserModel> findAllUsers()
    {
        return userRepo.findAll();

    }
    @PostMapping("/login")
    public ResponseEntity<UserModel> findUser(@RequestBody UserModel user)
    {
        UserModel currentUser = userRepo.findUserByEmail(user.getEmail());
        if (currentUser!= null)
        {
            if (currentUser.getPassword().equals(user.getPassword()))
            {
                return new ResponseEntity<>(currentUser, HttpStatus.OK);
            }
            else
            {
                return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
            }
           
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }   

    @GetMapping("/patients")
    public List<PatientModel> getAllPatient()
    {
        return patientRepo.findAll();
    }
    


}

