package com.carol.mySandcastle.security.services.impl;

import com.carol.mySandcastle.security.entities.User;
import com.carol.mySandcastle.security.repositores.UserRepository;
import com.carol.mySandcastle.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findByEmail(String email){
        return Optional.ofNullable(this.userRepository.findByEmail(email));
    }
}
