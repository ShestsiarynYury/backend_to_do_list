package app.model.util;

public enum Priority {
    LOW,
    MEDIUM,
    HIGH;

    @Override
    public String toString() {
        return "Priority{ " + this.name() + " }";
    }
}