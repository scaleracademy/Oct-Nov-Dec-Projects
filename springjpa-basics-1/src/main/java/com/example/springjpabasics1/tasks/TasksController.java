package com.example.springjpabasics1.tasks;

import com.example.springjpabasics1.common.ErrorResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    ResponseEntity<List<TaskEntity>> getAllTodos() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @PostMapping("/")
    ResponseEntity<TaskEntity> addNewTodo(@RequestBody CreateTaskDto body) {
        return new ResponseEntity(taskService.addNewTask(body.name), HttpStatus.CREATED);
    }

    // 200
    @GetMapping("/{id}")
    TaskEntity getTodoById(@PathVariable Integer id) {
        var task = taskService.getTaskById(id);
        return taskService.getTaskById(id);
    }

    // 202
    @DeleteMapping("/{id}")
    void deleteTodoById(@PathVariable Integer id) {
        taskService.deleteTask(id);
    }

    @PutMapping("/{id}/done")
    String setTodoDone(@PathVariable Integer id) {
        return "Set todo " + id + " to done"; // TODO
    }

    @DeleteMapping("/{id}/done")
    String setTodoNotDone(@PathVariable Integer id) {
        return "Set todo " + id + " to not done"; // TODO
    }

    @ExceptionHandler({TasksService.NoSuchTaskException.class})
    ResponseEntity<ErrorResponse> handleErrors(Exception e) {
        if (e instanceof TasksService.NoSuchTaskException) {
            return new ResponseEntity<>(ErrorResponse.from(e), HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.internalServerError().build();
    }
}
