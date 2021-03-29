package app.dto;

import java.time.LocalDateTime;

public class TaskDTO {
    private Long id;
    private String name;
    private String priority;
    private LocalDateTime timeBegin;
    private LocalDateTime timeEnd;

    public TaskDTO(Long id, 
        String name,
        String priority, 
        LocalDateTime timeBegin, 
        LocalDateTime timeEnd) 
    {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
    }

    public TaskDTO() {
        this(null, null, "LOW", null, null);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public LocalDateTime getTimeBegin() {
        return this.timeBegin;
    }

    public void setTimeBegin(LocalDateTime timeBegin) {
        this.timeBegin = timeBegin;
    }

    public LocalDateTime getTimeEnd() {
        return this.timeEnd;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", name='" + name + "'" +
            ", priority='" + priority + "'" +
            ", timeBegin='" + timeBegin + "'" +
            ", timeEnd='" + timeEnd + "'" +
            "}";
    }
}