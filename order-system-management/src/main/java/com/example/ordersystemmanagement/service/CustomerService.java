package com.example.ordersystemmanagement.service;

import com.example.ordersystemmanagement.entity.Customer;
import com.example.ordersystemmanagement.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public void insertCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
