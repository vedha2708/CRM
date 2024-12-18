package com.exe.Product_Marketer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface productmrepo extends JpaRepository<model, Integer>{
Optional<model> findByEmail(String email);
}
