package com.example.employeepayroll.repository;

import com.example.employeepayroll.dto.EmployeeDto;
import com.example.employeepayroll.model.EmpData;

import java.util.List;
//uc2
public interface IEmpService {
    public EmpData save(EmployeeDto employeeDto);
    public EmpData update(Integer id,EmployeeDto employeeDto);
    public EmpData delete(Integer id);
    public List<EmpData> getAllData();
}
