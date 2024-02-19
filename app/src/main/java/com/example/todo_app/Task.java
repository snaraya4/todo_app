package com.example.todo_app;

public class Task {
    private final String name;
    private boolean isCompleted;

    public Task(String name) {
        this.name = name;
        this.isCompleted = false; // By default, task is not completed
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}