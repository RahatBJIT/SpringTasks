package com.rahat.SpringMVC.controller;

import com.rahat.SpringMVC.exception.MemberNotFoundException;
import com.rahat.SpringMVC.exception.PrimiumMemberNotFoundException;
import com.rahat.SpringMVC.exception.PrimiumMemberPercentageNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({PrimiumMemberNotFoundException.class, PrimiumMemberPercentageNotFoundException.class, MemberNotFoundException.class})
    public ResponseEntity<Object> returnNotFoundException(Exception ex ){
        if (ex instanceof PrimiumMemberNotFoundException){
            //dff
            return new ResponseEntity<>( ex.getMessage(), HttpStatus.NOT_FOUND);

        }
        else if (ex instanceof PrimiumMemberPercentageNotFoundException){
            //dff
            return new ResponseEntity<>( ex.getMessage(), HttpStatus.CONFLICT);

        }
        else {
            //fdfdfd
            return new ResponseEntity<>( ex.getMessage(), HttpStatus.NOT_FOUND);

        }

    }
}
