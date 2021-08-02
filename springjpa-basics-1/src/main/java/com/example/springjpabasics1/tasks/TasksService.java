package com.example.springjpabasics1.tasks;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TasksService {

    private ArrayList<TaskEntity> taskList = new ArrayList<>();

    TaskEntity addNewTask(String taskName) {
        var task = new TaskEntity(taskName, false);
        taskList.add(task);
        return task;
    }

    List<TaskEntity> getAllTasks() {
        return taskList;
    }

    TaskEntity getTaskById(int index) {
        return taskList.get(index); // TODO: handle invalid index
    }

    TaskEntity setTaskDone(int index, Boolean done) {
        var task = taskList.get(index);
        task.setDone(done);
        return task;
    }

    boolean deleteTask(int index) {
        taskList.remove(index);
        return true; // TODO: handle invalid index and return false
    }
 }
