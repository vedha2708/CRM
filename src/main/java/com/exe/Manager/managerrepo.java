package com.exe.Manager;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface managerrepo extends JpaRepository<registermodel, Integer> {
    Optional<registermodel> findByName(String fullname);
}
