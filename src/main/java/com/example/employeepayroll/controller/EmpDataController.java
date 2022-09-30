package com.example.employeepayroll.controller;


import com.example.employeepayroll.dto.EmployeeDto;
import com.example.employeepayroll.dto.ResponseDto;
import com.example.employeepayroll.model.EmpData;
import com.example.employeepayroll.service.EmpDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/empdata")
public class EmpDataController {
    @Autowired
    EmpDataService empDataService;

    @PostMapping("/save")
    public ResponseEntity<ResponseDto> save(@Valid @RequestBody EmployeeDto employeeDto){
        EmpData empData=null;
        empData=empDataService.save(employeeDto);
        ResponseDto responseDto=new ResponseDto("saved data successfully",empData);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDto> update(@Valid @PathVariable Integer id,@RequestBody EmployeeDto employeeDto){
        EmpData empData=empDataService.update(id, employeeDto);
        ResponseDto responseDto=new ResponseDto("updated data successfully",empData);
        return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable Integer id){
        EmpData empData=empDataService.delete(id);
        ResponseDto responseDto=new ResponseDto( "deleted id:"+id+" successfully",empData);
        return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
    }
    @GetMapping("getall")
    public List<EmpData> getAll(){
        return empDataService.getAllData();
    }
}
