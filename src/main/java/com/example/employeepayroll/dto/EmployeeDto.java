//package com.example.employeepayroll.dto;
//
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Pattern;
//
//public class EmployeeDto {
//    @NotEmpty(message="Employee name can not be null")
//    @Pattern(regexp = "^[A-Z]+[a-zA-Z\\s]{2,}$",message = "Employee firstname is invalid")
//    public String name;
//    @Min(value = 500,message = "min wage should be more than 500")
//    @Max(value = 50000,message = "crossed max range")
//    public String salary;
//    public EmployeeDto(String name,String salary){
//        this.name=name;
//        this.salary=salary;
//    }
//}
