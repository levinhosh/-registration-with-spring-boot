package com.productivity.productivity.Login;


import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productivity.productivity.Registration.RegistrationModel;
import com.productivity.productivity.Registration.RegistrationServiceImplementation;

//read, reading by id, delete by id, 
@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class LoginController {

    private RegistrationServiceImplementation registrationServiceImplementation;
        // Getting an Employee by a certain Id
    @GetMapping("/employee/{id}")
    public RegistrationModel getEmployeesById(@PathVariable("id") Long id){
        return registrationServiceImplementation.findById(id);
    }
    
}
