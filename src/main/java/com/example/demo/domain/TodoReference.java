package com.example.demo.domain;

public class TodoReference {
    private Long id;
    private TodoItem currentTodoItem;
    private TodoItem prevTodoItem;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TodoItem getCurrentTodoItem() {
        return currentTodoItem;
    }

    public void setCurrentTodoItem(TodoItem currentTodoItem) {
        this.currentTodoItem = currentTodoItem;
    }

    public TodoItem getPrevTodoItem() {
        return prevTodoItem;
    }

    public void setPrevTodoItem(TodoItem prevTodoItem) {
        this.prevTodoItem = prevTodoItem;
    }
}
