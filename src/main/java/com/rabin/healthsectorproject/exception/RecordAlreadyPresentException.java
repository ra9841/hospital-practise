package com.rabin.healthsectorproject.exception;

public class RecordAlreadyPresentException extends RuntimeException{

    public RecordAlreadyPresentException(String message){
        super(message);
    }
}
