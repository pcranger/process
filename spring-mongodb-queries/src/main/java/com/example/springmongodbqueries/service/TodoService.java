package com.example.springmongodbqueries.service;

import com.example.springmongodbqueries.exception.TodoCollectionException;
import com.example.springmongodbqueries.model.TodoDTO;

import javax.validation.ConstraintViolationException;

public interface TodoService {
    public void createTodo(TodoDTO todo)  throws ConstraintViolationException, TodoCollectionException;
}
