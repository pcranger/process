package com.example.springmongodbqueries.repository;

import com.example.springmongodbqueries.model.TodoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends MongoRepository<TodoDTO, String> {

    @Query("{'todo':?0}") //.find{{'todo':?0}} //find all todos from 0 index
    Optional<TodoDTO> findByTodo(String todo);

}
