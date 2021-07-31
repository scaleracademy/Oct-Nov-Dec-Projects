package com.scaler.springdemo.todo;

public class Todo {
    private String taskName;
    private boolean done;

    public Todo() {}

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
