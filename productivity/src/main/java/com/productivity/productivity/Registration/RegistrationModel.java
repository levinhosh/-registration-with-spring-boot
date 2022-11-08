package com.productivity.productivity.Registration;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.UniqueConstraint;
import javax.persistence.*;


@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name="tbl_Registration", uniqueConstraints = {
    @UniqueConstraint(name = "employee_email_unique", columnNames = "email")
})
public class RegistrationModel {

    @SequenceGenerator(
        name = "employee_sequence",
        sequenceName = "employee_sequence",
        allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "firstName", nullable = false, columnDefinition = "TEXT")
    private String firstName;

    

    @Column(name = "lastName", nullable = false, columnDefinition = "TEXT")
    private String lastName;

    @Column(name = "designation", nullable = false, columnDefinition = "TEXT")
    private String designation;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "empRole", nullable = false, columnDefinition = "TEXT")
    private String employeeRole;


    @Column(name = "accLocked", nullable = false, columnDefinition = "TEXT")
    private String isLocked;

    @Column(name = "accEnabled", nullable = false, columnDefinition = "TEXT")
    private String isEnabled ;



    public RegistrationModel() {
    }




    public RegistrationModel(String firstName,String isLocked,String isEnabled,String lastName,String email,String password, String designation,String employeeRole) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isLocked = isLocked;
        this.isEnabled = isEnabled;
        this.password = password;
        this.employeeRole = employeeRole;
        this.designation = designation;
    }




    @Override
    public String toString() {
        return "RegistrationModel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", designation="
                + designation + ", email=" + email + ", password=" + password + ", employeeRole=" + employeeRole
                + ", locked=" + isLocked + ", enabled=" + isEnabled + "]";
    }

    

 

    
}
