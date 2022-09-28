package com.example.employeepayroll.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;
    private String salary;
    private String profilePic;
    private String note;
    private Date StartDate;

    public Employee(){

    }
    public Employee(String firstName,String lastName,String address,String salary,String profilePic,String note,Date StartDate){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.salary=salary;
        this.profilePic=profilePic;
        this.note=note;
        this.StartDate=StartDate;
    }
    public Employee(Integer id,String firstName,String lastName,String address,String salary,String profilePic,String note,Date StartDate){
        super();
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.salary=salary;
        this.profilePic=profilePic;
        this.note=note;
        this.StartDate=StartDate;
    }
}
