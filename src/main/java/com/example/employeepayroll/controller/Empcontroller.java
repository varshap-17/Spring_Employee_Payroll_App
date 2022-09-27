package com.example.employeepayroll.controller;

import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")

public class Empcontroller {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/get/{id}")
    public Employee employee(@PathVariable Integer id, @RequestParam String fname, String lname, String address, String salary, String pic, String note){
        Employee emp=new Employee();
        emp.setId(id);
        emp.setFirstName(fname);
        emp.setLastName(lname);
        emp.setAddress(address);
        emp.setSalary(salary);
        emp.setProfilePic(pic);
        emp.setNote(note);
        return emp;
    }
    @PostMapping("/getdata")
    public Employee getdata(@RequestBody Employee employee)
    {
        Employee empData = employeeService.postdata(employee);
        return empData;
    }
    @GetMapping("/getall")
    public List<Employee> getAll(){
        return employeeService.getAllData();
    }
    @PutMapping("/edit/{id}")
    public Employee editbyid(@PathVariable Integer id,@RequestParam String fname, String lname, String address, String salary, String pic, String note){
        return employeeService.editdata(employee(id,fname,lname,address,salary,pic,note));
    }
}
