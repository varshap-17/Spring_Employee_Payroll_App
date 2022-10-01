package com.example.employeepayroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class EmpDto {
    @NotEmpty(message = "Employee name can not be null")
    @Pattern(regexp = "^[A-Z]+[a-zA-Z\\s]{2,}$",message = "Employee firstname is invalid")
    public String firstName;
    @NotEmpty(message = "Employee lastname can not be null")
    @Pattern(regexp = "^[A-Z]+[a-zA-Z\\s]{2,}$",message = "Employee lastname is invalid")
    public String lastName;
    @NotEmpty(message = "Employee address can not be null")
    @Pattern(regexp = "^[a-zA-Z]*$",message = "address is invalid")
    public String address;
    @NotEmpty(message = "salary can not be null")
    @Min(value = 500,message = "min wage should be more than 500")
    @Max(value = 50000,message = "crossed max range")
    public String salary;
    @NotEmpty(message = "profile pic can not be null")
    public String profilePic;
    @NotEmpty(message = "note can not be null")
    @Pattern(regexp = "^[a-zA-Z]*(.)$",message = "note can be anything")
    public String note;
 //   @JsonFormat(pattern = "yyyy-mm-dd")
    @PastOrPresent(message = "past or present")
    public Date StartDate;
    @NotBlank(message = "gender should not be null")
    @Pattern(regexp = "^[A-Z]$")
    public String gender;
    @NotBlank(message = "department should not be null")
    @Pattern(regexp = "^[a-z]*$")
    public String department;

    public EmpDto(String firstName,String lastName,String address,String profilePic,String note,Date StartDate,String gender,String department){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.salary=profilePic;
        this.profilePic=profilePic;
        this.StartDate=StartDate;
        this.note=note;
        this.gender=gender;
        this.department=department;
    }
}
