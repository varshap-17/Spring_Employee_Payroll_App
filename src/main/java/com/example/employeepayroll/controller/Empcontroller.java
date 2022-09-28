package com.example.employeepayroll.controller;

import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")

public class Empcontroller {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/postdata")
    public Employee input(@RequestBody Employee employee) {
        Employee empData = employeeService.postdata(employee);
        return empData;
    }
    @GetMapping("/getall")
    public List<Employee> getAll(){
        return employeeService.getAllData();
    }
    @PutMapping("/edit/{id}")
    public Employee editbyid(@PathVariable Integer id,@RequestBody Employee employee){
        return employeeService.updateDataById(id, employee);
    }
    @GetMapping("/getbyid{id}")
    public Optional<Employee> getById(@PathVariable Integer id){
        return employeeService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deletebyid(@PathVariable Integer id){
        employeeService.deletedata(id);
        return "Employee with id:"+id+" deleted";
    }
}
