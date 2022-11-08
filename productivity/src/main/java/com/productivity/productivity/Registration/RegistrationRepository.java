package com.productivity.productivity.Registration;

import org.springframework.data.jpa.repository.JpaRepository;


// In this class extend from the JpaRepository library to access all the functions of DB
// Reduces time and complexity

public interface RegistrationRepository extends JpaRepository<RegistrationModel, Long> {
    
}
