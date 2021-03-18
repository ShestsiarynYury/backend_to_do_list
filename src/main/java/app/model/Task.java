package app.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import app.model.util.Priority;

@Entity
@Table(
    name = "tasks"
)
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "task_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "priority")
    private Priority priority;
    @Column(name = "time_begin")
    private LocalDateTime timeBegin;
    @Column(name = "time_end")
    private LocalDateTime timeEnd;

    public Task(Long id, 
        String name, 
        Priority priority, 
        LocalDateTime timeBegin, 
        LocalDateTime timeEnd) 
    {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
    }

    public Task() {
        this(null, null, null, null, null);
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public void setPriority(Priority priority) {
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
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", priority='" + getPriority() + "'" +
            ", timeBegin='" + getTimeBegin() + "'" +
            ", timeEnd='" + getTimeEnd() + "'" +
            "}";
    }
}