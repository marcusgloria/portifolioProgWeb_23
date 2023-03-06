package resource.exceptions;

import java.time.LocalDateTime;
import java.util.Objects;
import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable{

    private static final long serialVersionUID = -2401632350928308265L;

    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;


    public StandardError() {
    }

    public StandardError(LocalDateTime timestamp, int status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public StandardError timestamp(LocalDateTime timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    public StandardError status(int status) {
        setStatus(status);
        return this;
    }

    public StandardError error(String error) {
        setError(error);
        return this;
    }

    public StandardError message(String message) {
        setMessage(message);
        return this;
    }

    public StandardError path(String path) {
        setPath(path);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof StandardError)) {
            return false;
        }
        StandardError standardError = (StandardError) o;
        return Objects.equals(timestamp, standardError.timestamp) && status == standardError.status && Objects.equals(error, standardError.error) && Objects.equals(message, standardError.message) && Objects.equals(path, standardError.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, status, error, message, path);
    }

    @Override
    public String toString() {
        return "{" +
            " timestamp='" + getTimestamp() + "'" +
            ", status='" + getStatus() + "'" +
            ", error='" + getError() + "'" +
            ", message='" + getMessage() + "'" +
            ", path='" + getPath() + "'" +
            "}";
    }

}
