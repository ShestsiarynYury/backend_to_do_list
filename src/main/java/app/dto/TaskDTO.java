package app.dto;

import java.time.LocalDate;

public class TaskDTO {
    private Long id;
    private String name;
    private String priority;
    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private boolean ready;

    public TaskDTO(Long id, 
        String name,
        String priority, 
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

    public TaskDTO() {
        this(null, null, "LOW", null, null, false);
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
            " id='" + this.id + "'" +
            ", name='" + this.name + "'" +
            ", priority='" + this.priority + "'" +
            ", timeBegin='" + this.dateBegin + "'" +
            ", timeEnd='" + this.dateEnd + "'" +
            ", ready='" + this.ready + "'" +
            "}";
    }
}