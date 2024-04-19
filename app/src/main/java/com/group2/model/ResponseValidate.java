package com.group2.model;

public class ResponseValidate {
    private String message;
    private Integer status;

    public ResponseValidate(String message, Integer status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public Integer getStatus() {
        return status;
    }
}
