package com.productivity.productivity.Login;

import com.productivity.productivity.Registration.RegistrationModel;

public interface LoginService {
    RegistrationModel findById(Long id);
}
