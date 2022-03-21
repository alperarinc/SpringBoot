package com.SpringBootCrudExample.SpringBootCrudExample.exception;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException(String message){
        super(message);
    }
}
