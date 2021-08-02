package com.example.springjpabasics1.tasks;

import org.springframework.stereotype.Service;

import java.util.List;

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
        return tasksRepository.getById(index); // TODO: handle invalid index
    }

    TaskEntity setTaskDone(int index, Boolean done) {
        var task = tasksRepository.getById(index);
        task.setDone(done);
        return tasksRepository.save(task);
    }

    boolean deleteTask(int index) {
        tasksRepository.delete(
                tasksRepository.getById(index)
        );
        return true; // TODO: handle invalid index and return false
    }
}
