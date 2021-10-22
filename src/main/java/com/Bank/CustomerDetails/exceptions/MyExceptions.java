package com.Bank.CustomerDetails.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class MyExceptions extends RuntimeException{
        private static final long serialVersionUID = 1L;
        private final String action;
        private final String code;
        public MyExceptions(String action, String code) {
            this.action = action;
            this.code = code;
        }

        public MyExceptions(String message, String action, String code) {
            super(message);
            this.action = action;
            this.code = code;
        }

        public MyExceptions(String message, Throwable cause, String action, String code) {
            super(message, cause);
            this.action = action;
            this.code = code;
        }

        public MyExceptions(Throwable cause, String action, String code) {
            super(cause);
            this.action = action;
            this.code = code;
        }

        public MyExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String action, String code) {
            super(message, cause, enableSuppression, writableStackTrace);
            this.action = action;
            this.code = code;
        }



        public String getAction() {
            return action;
        }

        public String getCode() {
            return code;
        }
    }

