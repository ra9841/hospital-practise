package com.rabin.healthsectorproject.advice;

import com.rabin.healthsectorproject.exception.RecordAlreadyPresentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(RecordAlreadyPresentException.class)
    public ResponseEntity<Map<String, String>> ExceptionHandling(RecordAlreadyPresentException ex) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("Error Message", ex.getMessage());
        errorMap.put("Status", HttpStatus.ALREADY_REPORTED.toString());
        return ResponseEntity.ok(errorMap);

    }
}
