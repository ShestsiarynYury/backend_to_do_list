package app.model.util;

import org.springframework.stereotype.Component;

@Component
public class ErrorDescription {
    private String url;
    private String message;

    public ErrorDescription(String url, String message) {
        this.url = url;
        this.message = message;
    }

    public ErrorDescription() {
        this(null, null);
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{" +
            " url='" + getUrl() + "'" +
            ", message='" + getMessage() + "'" +
            "}";
    }
}
