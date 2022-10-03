package com.example.employeepayroll.service;

import com.example.employeepayroll.dto.EmpDto;
import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    EmployeeRepository repository;
    public Employee postdata(EmpDto empDto){
        Employee employee=new Employee(empDto);
        return repository.save(employee);
    }
    public Optional<Employee> findById(Integer id){
        return repository.findById(id);
    }
    public List<Employee> getAllData(){
        return repository.findAll();
    }

    public Employee updateDataById(Integer id,EmpDto empDto){
        Employee employee=new Employee(id,empDto);
        repository.save(employee);
        return employee;
    }
    public Employee deletedata(Integer id){
        repository.deleteById(id);
        return null;
    }
    public List<Employee> getEmployeeByName(String firstName){
        return repository.findEmployeeByFirstName(firstName);
    }
    public List<Employee> getEmployeesByDepartment(String department){
        return repository.findEmployeesByDepartment(department);
    }
}
