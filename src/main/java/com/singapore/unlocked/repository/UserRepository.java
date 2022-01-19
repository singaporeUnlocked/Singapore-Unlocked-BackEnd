package com.singapore.unlocked.repository;

import com.singapore.unlocked.model.UserModel;

import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

public interface UserRepository extends MongoRepository<UserModel, String> {
    @Query("{email:'?0'}")
    UserModel findUserByEmail(String email);

}
