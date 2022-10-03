package com.example.employeepayroll.service;

import com.example.employeepayroll.dto.EmpDto;
import com.example.employeepayroll.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    public Employee postdata(EmpDto empDto);
    public Optional<Employee> findById(Integer id);
    public List<Employee> getAllData();
    public Employee updateDataById(Integer id,EmpDto empDto);
    public Employee deletedata(Integer id);
    public List<Employee> getEmployeeByName(String firstName);
}
