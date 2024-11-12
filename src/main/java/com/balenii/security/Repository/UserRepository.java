tr4package com.balenii.security.Repository;

import com.balenii.security.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
