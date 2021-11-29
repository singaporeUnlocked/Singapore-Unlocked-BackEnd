package com.singapore.unlocked.repository;

import com.singapore.unlocked.model.UserModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends MongoRepository<UserModel, Integer> {
    UserModel findByEmail(String email);
}
