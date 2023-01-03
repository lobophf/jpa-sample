package dev.pedrolobo.jpa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Employee {

    @Id
    @SequenceGenerator(name="SEQ",sequenceName="Employee_SEQ", allocationSize=1)        
    @GeneratedValue(strategy=GenerationType.AUTO, generator="SEQ")    
    private Long id;
    private String fName;
    private String lName;
    public Employee() {
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
}
