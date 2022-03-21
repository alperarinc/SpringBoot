package com.SpringBootCrudExample.SpringBootCrudExample.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomerNotNullException.class)
    public ResponseEntity<?> customerNotNull(CustomerNotNullException customerNotNullException){
        List<String> detail=new ArrayList<>();
        detail.add(customerNotNullException.getMessage());
        ErrorResponse errorResponse=new ErrorResponse("Customer Not Null", detail);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<?> customerNotFound(CustomerNotFoundException customerNotFoundException){
        List<String> detail = new ArrayList<>();
        detail.add(customerNotFoundException.getMessage());
        ErrorResponse errorResponse = new ErrorResponse("Customer Not Found", detail);
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }
}
