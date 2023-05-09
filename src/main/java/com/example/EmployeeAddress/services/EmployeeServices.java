package com.example.EmployeeAddress.services;

import com.example.EmployeeAddress.employeeModen.Employee;
import com.example.EmployeeAddress.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServices {
    @Autowired
    private EmployeeRepo employeeRepo;

    public String AddEmployee(Employee add){
        employeeRepo.save(add);
        return "add employee";
    }
    public Iterable<Employee> getAll(){
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployee(int id) {
        return employeeRepo.findById(id);
    }

    public String deleteEmployee(int id) {
        employeeRepo.deleteById(id);
        return "employee deleted";
    }

    public String updateEmployee(int id, Employee employee) {
        employeeRepo.save((employee));
        return "Updated";
    }
}
