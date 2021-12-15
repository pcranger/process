package com.example.springmongodbqueries.service;

import com.example.springmongodbqueries.exception.TodoCollectionException;
import com.example.springmongodbqueries.model.TodoDTO;
import com.example.springmongodbqueries.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintViolationException;
import java.util.Date;
import java.util.Optional;

public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoRepository todoRepo;

    //preparing for controller refactor
    @Override
    public void createTodo(TodoDTO todo) throws ConstraintViolationException, TodoCollectionException{
        Optional<TodoDTO> todoOptional = todoRepo.findByTodo(todo.getTodo());
        if(todoOptional.isPresent()){
            throw new TodoCollectionException(TodoCollectionException.TodoAlreadyExists());
        }else{
            todo.setCreatedAt(new Date(System.currentTimeMillis()));
            todoRepo.save(todo);
        }
    }
}
