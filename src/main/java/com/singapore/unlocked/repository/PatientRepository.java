package com.singapore.unlocked.repository;

import java.util.List;

import com.mongodb.client.MongoDatabase;
import com.singapore.unlocked.model.PatientModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PatientRepository extends MongoRepository<PatientModel, String> {
    @Query(value = "{ }" , fields="{ 'id' : 1, 'patientId' : 1, 'name' : 1 , 'cognitiveRatings' : 1, 'socialRatings' : 1, 'physicalRatings' : 1}")
    List<PatientModel> patientsSummary();
    
    @Query("{patientId:'?0'}")
    PatientModel findUserById(String id);

    

    
}
