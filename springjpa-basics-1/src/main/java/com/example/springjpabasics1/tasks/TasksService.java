package com.example.springjpabasics1.tasks;

import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TasksService {

    private TasksRepository tasksRepository;

    public TasksService(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    TaskEntity addNewTask(String taskName) {
        var task = new TaskEntity(taskName, false);
        tasksRepository.save(task);
        return task;
    }

    List<TaskEntity> getAllTasks() {
        return tasksRepository.findAll();
    }

    TaskEntity getTaskById(int index) {
        try {
            return tasksRepository.findById(index).get();
        } catch (EntityNotFoundException | NoSuchElementException e) {
            throw new NoSuchTaskException();
        }
    }

    TaskEntity setTaskDone(int index, Boolean done) {
        var task = getTaskById(index);
        task.setDone(done);
        return tasksRepository.save(task);
    }

    boolean deleteTask(int index) {
        tasksRepository.delete(
                getTaskById(index)
        );
        return true;
    }

    static class NoSuchTaskException extends RuntimeException {
        public NoSuchTaskException() {
            super("No such task exists");
        }
    }
}
