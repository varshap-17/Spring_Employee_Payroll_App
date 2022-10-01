package com.example.employeepayroll.model;

import com.example.employeepayroll.dto.EmpDto;
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
    private String gender;
    private String department;

    public Employee(){

    }
    public Employee(EmpDto empDto){
        this.firstName=empDto.firstName;
        this.lastName=empDto.lastName;
        this.address=empDto.address;
        this.salary=empDto.salary;
        this.profilePic=empDto.profilePic;
        this.note=empDto.note;
        this.StartDate=empDto.StartDate;
        this.gender=empDto.gender;
        this.department=empDto.department;
    }
    public Employee(Integer id,EmpDto empDto){
        super();
        this.id=id;
        this.firstName=empDto.firstName;
        this.lastName=empDto.lastName;
        this.address=empDto.address;
        this.salary=empDto.salary;
        this.profilePic=empDto.profilePic;
        this.note=empDto.note;
        this.StartDate=empDto.StartDate;
        this.gender=empDto.gender;
        this.department=empDto.department;
    }
}
