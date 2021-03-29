package app.model.util;

import org.springframework.stereotype.Component;

public enum Priority {
    LOW,
    MEDIUM,
    HIGH;

    private Priority() {

    }

    @Override
    public String toString() {
        return "Priority{ " + this.name() + " }";
    }
}