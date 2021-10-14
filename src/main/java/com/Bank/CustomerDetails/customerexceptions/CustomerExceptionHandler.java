package com.Bank.CustomerDetails.customerexceptions;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionHandler {
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<?> resultException(NullPointerException e){
        return new ResponseEntity<Object>(" Customer not found ", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<?> resultException1(EmptyResultDataAccessException e){
        return  new ResponseEntity<Object>("Empty",HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CutomException.class)
    public ResponseEntity<?> CutomException(CutomException e){
        return new ResponseEntity<Object>( "no data",HttpStatus.BAD_REQUEST);
    }
}







