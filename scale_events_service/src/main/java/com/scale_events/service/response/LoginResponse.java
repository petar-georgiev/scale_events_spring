package com.scale_events.service.response;

public class LoginResponse {
    String message;
    Boolean status;

    public LoginResponse(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }

    public LoginResponse() {
    }

    public String getMessage() {
        return message;
    }

    public LoginResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Boolean getStatus() {
        return status;
    }

    public LoginResponse setStatus(Boolean status) {
        this.status = status;
        return this;
    }
}
