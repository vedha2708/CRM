package com.exe.Salesteam;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exe.Usermanagement.registeruser;

public interface salesrepo extends JpaRepository<registermodel, Integer>{
    Optional<registeruser> findByName(String name);
}
