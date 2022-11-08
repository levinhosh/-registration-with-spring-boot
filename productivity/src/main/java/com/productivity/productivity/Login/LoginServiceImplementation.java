package com.productivity.productivity.Login;

import com.productivity.productivity.Registration.RegistrationModel;
import com.productivity.productivity.Registration.RegistrationRepository;

public class LoginServiceImplementation implements LoginService{
    
    private RegistrationRepository registrationRepository;
    public LoginServiceImplementation(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    //login operation is a read operation
    @Override
    public RegistrationModel findById(Long id) {
        return registrationRepository.findById(id).get();
    }
    
}
