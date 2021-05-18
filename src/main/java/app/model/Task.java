package app.model;

import java.time.LocalDate;
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
    @Column(name = "date_begin")
    private LocalDate dateBegin;
    @Column(name = "date_end")
    private LocalDate dateEnd;
    @Column(name = "ready")
    private boolean ready;

    public Task(Long id, 
        String name, 
        Priority priority, 
        LocalDate dateBegin, 
        LocalDate dateEnd,
        boolean ready) 
    {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.ready = ready;
    }

    public Task() {
        this(null, null, null, null, null, false);
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

    public Priority getPriority() {
        return this.priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDate getDateBegin() {
        return this.dateBegin;
    }

    public void setDateBegin(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
    }

    public LocalDate getDateEnd() {
        return this.dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public boolean isReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
    
    @Override
    public String toString() {
        return "{" +
            " id='" + this.getId() + "'" +
            ", name='" + this.getName() + "'" +
            ", priority='" + this.getPriority() + "'" +
            ", timeBegin='" + this.getDateBegin() + "'" +
            ", timeEnd='" + this.getDateEnd() + "'" +
            ", ready='" + this.isReady() + "'" +
            "}";
    }
}