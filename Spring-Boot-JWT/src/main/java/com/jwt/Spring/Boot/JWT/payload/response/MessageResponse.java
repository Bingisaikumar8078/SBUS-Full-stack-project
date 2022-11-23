package com.jwt.Spring.Boot.JWT.payload.response;

public class MessageResponse {
    private  String s;

    public MessageResponse(String s) {
        this.s = s;
    }
    public String getMessage() {
        return s;
    }

    public void setMessage(String message) {
        this.s = message;

    }
    }
