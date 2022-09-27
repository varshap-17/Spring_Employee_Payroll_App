package com.example.employeepayroll.service;

import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;
    public Employee postdata(Employee employee){
        repository.save(employee);
        return employee;
    }
    public List<Employee> getAllData(){
        return repository.findAll();
    }
    public Employee editdata(Employee employee) {
        repository.save(employee);
        return employee;
    }
}
