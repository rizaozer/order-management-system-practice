package com.example.ordersystemmanagement.controller;

import com.example.ordersystemmanagement.entity.Customer;
import com.example.ordersystemmanagement.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void createCustomer(Customer customer) {
        customerService.insertCustomer(customer);
    }
}
