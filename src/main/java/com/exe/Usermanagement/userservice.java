package com.exe.Usermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userservice {
    @Autowired
    private userrepo repo;

    public registeruser registerUser(registeruser registeruser) {
        // Check if email already exists
        if (repo.findByEmail(registeruser.getEmail()).isPresent()) {
            throw new EmailAlreadyInUseException("Email is already Registered");
        }
        return repo.save(registeruser);
    }
}
