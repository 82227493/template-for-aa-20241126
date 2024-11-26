package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "todo_item")
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Boolean isChecked;
    private Status status;
    private Date regDate;
    private Date modDate;
    private List<Long> prevTodoIds;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getModDate() {
        return modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }

    public List<Long> getPrevTodoIds() {
        return prevTodoIds;
    }

    public void setPrevTodoIds(List<Long> prevTodoIds) {
        this.prevTodoIds = prevTodoIds;
    }

    // Builder pattern example
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String content;
        private Boolean isChecked;
        private Status status;
        private Date regDate;
        private Date modDate;
        private List<Long> prevTodoIds;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder isChecked(Boolean isChecked) {
            this.isChecked = isChecked;
            return this;
        }

        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        public Builder regDate(Date regDate) {
            this.regDate = regDate;
            return this;
        }

        public Builder modDate(Date modDate) {
            this.modDate = modDate;
            return this;
        }

        public Builder prevTodoIds(List<Long> prevTodoIds) {
            this.prevTodoIds = prevTodoIds;
            return this;
        }

        public TodoItem build() {
            TodoItem item = new TodoItem();
            item.id = this.id;
            item.content = this.content;
            item.isChecked = this.isChecked;
            item.status = this.status;
            item.regDate = this.regDate;
            item.modDate = this.modDate;
            item.prevTodoIds = this.prevTodoIds;
            return item;
        }
    }
}
