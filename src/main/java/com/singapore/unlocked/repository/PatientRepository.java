package com.singapore.unlocked.repository;

import com.mongodb.client.MongoDatabase;
import com.singapore.unlocked.model.PatientModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<PatientModel, String> {
    
    
}
