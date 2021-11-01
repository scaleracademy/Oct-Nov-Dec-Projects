package com.scaler.springdemo.todo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    List<Todo> todos = new ArrayList<>();

    @PostMapping("/todos")
    public void createTodo(@RequestBody Todo task){
        todos.add(task);
    }

    @GetMapping("/todos")
    public List<Todo> getTodo(){
        return todos;
    }

    @GetMapping("/todos/{id}")
    public Todo getTodo(@PathVariable int id){
        int index = id-1;
        if(index>=todos.size()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Entity Id: " + id);
        }

        return todos.get(index);
    }

    @PutMapping("/todos/{id}/done")
    public Todo updateTodoToDone(@PathVariable int id){
        int index = id-1;
        if(index>=todos.size()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Entity Id: " + id);
        }
        Todo task = todos.get(index);
        task.setDone(true);
        return task;
    }

    @DeleteMapping("/todos/{id}/done")
    public Todo updateTodoToNotDone(@PathVariable int id){
        int index = id-1;
        if(index>=todos.size()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Entity Id: " + id);
        }

        Todo task = todos.get(index);
        task.setDone(false);
        return task;
    }
}
