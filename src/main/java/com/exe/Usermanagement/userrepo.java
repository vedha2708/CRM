package com.exe.Usermanagement;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface userrepo extends JpaRepository<registeruser, Integer> {
    Optional<registeruser> findByEmail(String email);
}
