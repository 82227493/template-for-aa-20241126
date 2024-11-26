package com.example.demo.dto;

import java.util.Date;
import java.util.List;

public class TodoItemDto {
    private Long id;
    private String content;
    private Boolean isChecked;
    private String status;
    private Date regDate;
    private Date modDate;
    private List<Long> prevIds;
    private String modifyType;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public List<Long> getPrevIds() {
        return prevIds;
    }

    public void setPrevIds(List<Long> prevIds) {
        this.prevIds = prevIds;
    }

    public String getModifyType() {
        return modifyType;
    }

    public void setModifyType(String modifyType) {
        this.modifyType = modifyType;
    }

    // Builder pattern example
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String content;
        private Boolean isChecked;
        private String status;
        private Date regDate;
        private Date modDate;
        private List<Long> prevIds;
        private String modifyType;

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

        public Builder status(String status) {
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

        public Builder prevIds(List<Long> prevIds) {
            this.prevIds = prevIds;
            return this;
        }

        public Builder modifyType(String modifyType) {
            this.modifyType = modifyType;
            return this;
        }

        public TodoItemDto build() {
            TodoItemDto dto = new TodoItemDto();
            dto.id = this.id;
            dto.content = this.content;
            dto.isChecked = this.isChecked;
            dto.status = this.status;
            dto.regDate = this.regDate;
            dto.modDate = this.modDate;
            dto.prevIds = this.prevIds;
            dto.modifyType = this.modifyType;
            return dto;
        }
    }
}
