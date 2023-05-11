package com.rahat.SpringMVC.exception;

public class PrimiumMemberNotFoundException extends RuntimeException{

    public PrimiumMemberNotFoundException(String message) {
        super(message);
    }
}
