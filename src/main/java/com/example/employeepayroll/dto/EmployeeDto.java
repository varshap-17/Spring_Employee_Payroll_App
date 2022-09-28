package com.example.employeepayroll.dto;

import lombok.Data;

@Data
public class EmployeeDto { //uc1
    public String name;
    public String salary;

    public EmployeeDto(String name,String salary){
        this.name=name;
        this.salary=salary;
    }
}
