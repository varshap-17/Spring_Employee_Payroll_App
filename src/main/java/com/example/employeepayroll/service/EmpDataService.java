package com.example.employeepayroll.service;

import com.example.employeepayroll.dto.EmployeeDto;
import com.example.employeepayroll.model.EmpData;
import com.example.employeepayroll.repository.EmpDataRepository;
import com.example.employeepayroll.repository.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpDataService implements IEmpService {
    @Autowired
    EmpDataRepository empDataRepository;

    //uc2
    public EmpData save(EmployeeDto employeeDto){
        EmpData emp=new EmpData(employeeDto);
        return empDataRepository.save(emp);
    }
    public EmpData update(Integer id,EmployeeDto employeeDto){
        EmpData empData=new EmpData(id, employeeDto);
        empDataRepository.save(empData);
        return empData;
    }
    public EmpData delete(Integer id){
       empDataRepository.deleteById(id);
        return null;
    }
    public List<EmpData> getAllData(){
        return empDataRepository.findAll();
    }
}
