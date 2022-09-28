package com.example.employeepayroll.service;

import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;
    public Employee postdata(Employee employee){
        repository.save(employee);
        return employee;
    }
    public Optional<Employee> findById(Integer id){
        return repository.findById(id);
    }
    public List<Employee> getAllData(){
        return repository.findAll();
    }

    public Employee updateDataById(Integer id,Employee employee){
        Optional<Employee> empedit=repository.findById(id);
        if (empedit.isEmpty()){
            return null;
        }
        Employee newEmployee=new Employee(id,employee.getFirstName(), employee.getLastName(), employee.getAddress(), employee.getSalary(), employee.getProfilePic(), employee.getNote(), employee.getStartDate());
        repository.save(newEmployee);
        return newEmployee;
    }
    public void deletedata(Integer id){
        repository.deleteById(id);
    }
}
