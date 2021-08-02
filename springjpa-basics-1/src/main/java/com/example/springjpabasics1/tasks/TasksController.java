package com.example.springjpabasics1.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tasks")
@RestController()
public class TasksController {

    static class CreateTaskDto {
        @JsonProperty("name")
        String name;
    }

    private TasksService taskService;

    public TasksController(TasksService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    List<TaskEntity> getAllTodos() {
        return taskService.getAllTasks();
    }

    @PostMapping("/")
    TaskEntity addNewTodo(@RequestBody CreateTaskDto body) {
        return taskService.addNewTask(body.name);
    }

    @GetMapping("/{id}")
    String getTodoById(@PathVariable Integer id) {
        return "Todo of given id = " + id;
    }

    @PutMapping("/{id}/done")
    String setTodoDone(@PathVariable Integer id) {
        return "Set todo " + id + " to done";
    }

    @DeleteMapping("/{id}/done")
    String setTodoNotDone(@PathVariable Integer id) {
        return "Set todo " + id + " to not done";
    }
}
