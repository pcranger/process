package com.hieu.springmongojracademy.controller;

import com.hieu.springmongojracademy.model.Employee;
import com.hieu.springmongojracademy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public Employee save(@RequestBody Employee emp){
        emp.setJoiningDate( new Date());
        return employeeService.save(emp);
    }
}
