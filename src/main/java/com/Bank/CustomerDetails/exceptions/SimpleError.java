package com.Bank.CustomerDetails.exceptions;

import org.springframework.stereotype.Component;

@Component
public class SimpleError {
    private  String httpCode ;
    private  String message;
    private  String action;
    public String getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(String httpCode) {
        this.httpCode = httpCode;
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
