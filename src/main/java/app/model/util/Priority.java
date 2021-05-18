package app.model.util;

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