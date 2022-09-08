package com.example.ordersystemmanagement.controller;

import com.example.ordersystemmanagement.entity.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("customers")
public class CustomerController {

    @PostMapping
    public Customer createCustomer(Customer customer) {
        return null;
    }
}
