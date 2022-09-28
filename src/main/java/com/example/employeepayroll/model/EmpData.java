package com.example.employeepayroll.model;

import com.example.employeepayroll.dto.EmployeeDto;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class EmpData {
    @Id
    @GeneratedValue
    private Integer id;
    public String name;
    public String salary;

    public EmpData(){

    }
    public EmpData(Integer id, EmployeeDto employeeDto){
        this.id=id;
        this.name=employeeDto.name;
        this.salary=employeeDto.salary;
    }
    //save your data in db this constructor need
    public EmpData(EmployeeDto employeeDto){
        this.name=employeeDto.name;
        this.salary=employeeDto.salary;
    }
}
