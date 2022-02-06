package com.singapore.unlocked.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.attribute.UserPrincipal;
import java.util.List;
import java.util.Optional;

import javax.sound.midi.Soundbank;

import com.singapore.unlocked.model.PatientModel;
import com.singapore.unlocked.model.UserModel;
import com.singapore.unlocked.model.PatientModel.GamesPlayed;
import com.singapore.unlocked.model.PatientModel.GamesPlayed.CognitiveGames;
import com.singapore.unlocked.model.PatientModel.GamesPlayed.Concentration;
import com.singapore.unlocked.model.PatientModel.GamesPlayed.ImageMatching;
import com.singapore.unlocked.model.PatientModel.GamesPlayed.PhysicalGames;
import com.singapore.unlocked.model.PatientModel.GamesPlayed.Plays;
import com.singapore.unlocked.model.PatientModel.GamesPlayed.SoundMatching;
import com.singapore.unlocked.repository.PatientRepository;
import com.singapore.unlocked.repository.UserRepository;


@RestController
<<<<<<< HEAD
@CrossOrigin(origins = "http://localhost:30199", allowedHeaders = "*", allowCredentials = "true")
=======
>>>>>>> c5abc4084db2e16ca4e1927d83de321aa23bbdde
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
            
        
        return patientRepo.patientsSummary();
    }
    @GetMapping("/patients/{id}")
    public PatientModel getPatientByID(@PathVariable String id)
    {
        PatientModel patientModel = patientRepo.findUserById(id);
        GamesPlayed gamesPlayed = patientModel.getGamesPlayed();
        CognitiveGames cognitiveGames = gamesPlayed.getCognitiveGames();
        ImageMatching imageMatching = cognitiveGames.getImageMatching();
        SoundMatching soundMatching = cognitiveGames.getSoundMatching();
        Concentration concentration = cognitiveGames.getConcentration();
        Plays[] imageMatchingPlays = imageMatching.getPlays();
        Plays[] soundMatchingPlays = soundMatching.getPlays();
        Plays[] concentrationPlays = concentration.getPlays();
        

        // //update game number of times played
        imageMatching.setNumberOfTimesPlayed(imageMatchingPlays.length);
        soundMatching.setNumberOfTimesPlayed(soundMatchingPlays.length);
        concentration.setNumberOfTimesPlayed(concentrationPlays.length);


        // //update numberoftimesplayedinlevel
        imageMatching.updateNumberOfTimesPlayedInLevel();
        soundMatching.updateNumberOfTimesPlayedInLevel();
        concentration.updateNumberOfTimesPlayedInLevel();

        // //Reset Everything
        // gamesPlayed.setImageMatching(imageMatching);
        // gamesPlayed.setSoundMatching(soundMatching);
        // gamesPlayed.setConcentration(concentration);
        // patientModel.setGamesPlayed(gamesPlayed);
        
    


        return patientModel;



       
        
    }
   
    


}

