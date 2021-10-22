package com.Bank.CustomerDetails.exceptions;

import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;
    private String action;

    public ErrorDetails(Date timestamp, String message, String details, String action) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
        this.action = action;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public String getAction() {
        return action;
    }
}