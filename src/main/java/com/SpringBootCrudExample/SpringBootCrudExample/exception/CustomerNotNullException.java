package com.SpringBootCrudExample.SpringBootCrudExample.exception;

public class CustomerNotNullException extends RuntimeException{
    public CustomerNotNullException(String message){
        super(message);
    }

}
