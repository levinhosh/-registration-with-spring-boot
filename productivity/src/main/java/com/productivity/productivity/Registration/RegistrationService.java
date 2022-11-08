package com.productivity.productivity.Registration;

import java.util.List;
import java.util.Optional;


// In this class define all your methods that you are likely to perform on your model
// or with the app

public interface RegistrationService {

    List < RegistrationModel > findAll();

    void saveEmployee(RegistrationModel registrationModel);

    RegistrationModel findById(Long id);

    void delete(Long id);
    

}
