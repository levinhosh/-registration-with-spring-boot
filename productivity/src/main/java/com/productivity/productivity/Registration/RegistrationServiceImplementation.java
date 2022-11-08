


package com.productivity.productivity.Registration;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


// Implement the service class methods here
//

@Service
public class RegistrationServiceImplementation implements RegistrationService{

    
    //helps in accessing JpaRepository methods
    private RegistrationRepository registrationRepository;

     public RegistrationServiceImplementation(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @Override
    public RegistrationModel findById(Long id) {
        return registrationRepository.findById(id).get();
    }

    @Override
    public void saveEmployee(RegistrationModel registrationModel) {
        
        registrationRepository.save(registrationModel);
    }

    @Override
    public List < RegistrationModel > findAll() {
        return registrationRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        registrationRepository.deleteById(id);
    }


}  