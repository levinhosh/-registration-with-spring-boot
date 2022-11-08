package com.productivity.productivity.Registration;

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

//read, reading by id, delete by id, 
@RestController
@CrossOrigin(origins = "http://localhost:4200")
// @RequestMapping(path = "/emp")
public class RegistrationController {
    
    private RegistrationServiceImplementation registrationServiceImplementation;

    public RegistrationController(RegistrationServiceImplementation registrationServiceImplementation) {
        this.registrationServiceImplementation = registrationServiceImplementation;
    }
    

    //Deleting a Employee by Id
    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        registrationServiceImplementation.delete(id);
        
    }

    //Returning a list of all Employees
    @GetMapping("/employee")
    public List<RegistrationModel> getAllEmployees(){
        return registrationServiceImplementation.findAll();
    }

    // Getting an Employee by a certain Id
    @GetMapping("/employee/{id}")
    public RegistrationModel getEmployeesById(@PathVariable("id") Long id){
        return registrationServiceImplementation.findById(id);
    }

    // Creating a new Employee
    @PostMapping("/employee")
    public void addEmployee(@RequestBody RegistrationModel registrationModel){
        registrationServiceImplementation.saveEmployee(registrationModel);
    }

    // Updating Employee details
    @PutMapping("/employee")
    public void updateEmployee(@RequestBody RegistrationModel registrationModel){
        registrationServiceImplementation.saveEmployee(registrationModel);
    }

    @GetMapping("/SecurityTest")
    public String myPwd(){
        ScryptedPasswordAlgorithm spa = new ScryptedPasswordAlgorithm();
		String newPwd = spa.encode("Fr26YtB");
		return (newPwd);

    }

    @RequestMapping("/home")
	public String goHome() {
		return "index";
	}


}
