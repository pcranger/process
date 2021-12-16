package com.hieu.springmongojracademy.service;


import com.hieu.springmongojracademy.model.Employee;
import com.hieu.springmongojracademy.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee save(Employee emp){
        return employeeRepository.save(emp);
    }


}
