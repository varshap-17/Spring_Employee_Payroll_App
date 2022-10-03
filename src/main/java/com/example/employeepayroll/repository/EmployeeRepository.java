package com.example.employeepayroll.repository;

import com.example.employeepayroll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(value = "select * from employee where first_name=:firstName",nativeQuery=true)
    List<Employee> findEmployeeByFirstName(String firstName);
    @Query(value = "SELECT * from employee where department=:department",nativeQuery = true)
    List<Employee> findEmployeesByDepartment(String department);
}
