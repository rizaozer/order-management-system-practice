package com.example.ordersystemmanagement.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
