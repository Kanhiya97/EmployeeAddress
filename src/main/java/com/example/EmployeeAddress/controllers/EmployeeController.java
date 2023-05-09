package com.example.EmployeeAddress.controllers;

import com.example.EmployeeAddress.employeeModen.Employee;
import com.example.EmployeeAddress.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServices employeeServices;
    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee emp){
        return employeeServices.AddEmployee(emp);
    }
    @GetMapping("/getEmployees")
    public Iterable<Employee> getAll(){
        return employeeServices.getAll();
    }

    @GetMapping("/getEmployees/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id){
        return employeeServices.getEmployee(id);
    }
    @DeleteMapping(value = "/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        return employeeServices.deleteEmployee(id);
    }
    @PutMapping(value = "/update/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        return employeeServices.updateEmployee(id,employee);
    }


}
