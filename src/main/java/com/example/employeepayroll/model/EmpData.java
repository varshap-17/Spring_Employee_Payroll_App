package com.example.employeepayroll.model;

import com.example.employeepayroll.dto.EmployeeDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class EmpData {
    @Id
    @GeneratedValue
    private Integer id;
    public String name;
    public String salary;

    public EmpData(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
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
