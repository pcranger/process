package com.hieu.springmongojracademy.repository;


import com.hieu.springmongojracademy.model.Employee;
import com.mongodb.BasicDBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    @Autowired
    MongoTemplate mongoTemplate;

    public Employee save(Employee emp){
        return mongoTemplate.save(emp);
    }
}
