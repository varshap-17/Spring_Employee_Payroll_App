package com.example.employeepayroll.controller;

import com.example.employeepayroll.dto.EmpDto;
import com.example.employeepayroll.dto.ResponseDto;
import com.example.employeepayroll.model.Employee;
import com.example.employeepayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

 @RestController
@RequestMapping("/emp")

public class Empcontroller {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/postdata")
    public ResponseEntity<ResponseDto> postData(@Valid @RequestBody EmpDto empDto){
        Employee employee=null;
        employee=employeeService.postdata(empDto);
        ResponseDto responseDto=new ResponseDto("saved data successfully",employee);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }
    @GetMapping("/getall")
    public List<Employee> getAll(){
        return employeeService.getAllData();
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<ResponseDto> updateById(@Valid @PathVariable Integer id,@RequestBody EmpDto empDto){
        Employee employee=employeeService.updateDataById(id,empDto);
        ResponseDto responseDto=new ResponseDto("Updated data successfully",employee);
        return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
    }
    @GetMapping("/getbyid{id}")
    public ResponseEntity<ResponseDto> find(@PathVariable Integer id){
        Optional<Employee> employee=null;
        employee=employeeService.findById(id);
        ResponseDto responseDto=new ResponseDto("get call for id successfully",employee);
        return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable Integer id){
        employeeService.deletedata(id);
        ResponseDto responseDto=new ResponseDto("deleted id:"+id+" successfully",id);
        return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
    }
    @GetMapping("/firstname/{firstName}")
     public ResponseEntity<ResponseDto> getempbyname(@PathVariable String firstName){
        List<Employee> employee=employeeService.getEmployeeByName(firstName);
        ResponseDto responseDto=new ResponseDto("get employee details from name",employee);
        return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
    }
     @GetMapping("/department/{department}")
     public ResponseEntity<ResponseDto> getempbydept(@PathVariable String department){
        List<Employee> employee=employeeService.getEmployeesByDepartment(department);
        ResponseDto responseDto=new ResponseDto("get employees from department",employee);
        return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
    }
}
