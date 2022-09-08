package com.example.ordersystemmanagement.controller;

import com.example.ordersystemmanagement.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController("orders")
public class OrderController {

    @PostMapping
    public Order createOrder(Order order) {
        return null;
    }

    @GetMapping
    public List<Order> search() {
        return null;
    }
}
