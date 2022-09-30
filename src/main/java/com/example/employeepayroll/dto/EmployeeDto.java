package com.example.employeepayroll.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class EmployeeDto {
    @NotEmpty(message="Employee name can not be null")
    public String name;
    @Min(value = 500,message = "min wage should be more than 500")
    public String salary;
    public EmployeeDto(String name,String salary){
        this.name=name;
        this.salary=salary;
    }
}
