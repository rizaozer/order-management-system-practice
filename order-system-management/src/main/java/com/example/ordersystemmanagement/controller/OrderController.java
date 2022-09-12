package com.example.ordersystemmanagement.controller;

import com.example.ordersystemmanagement.entity.Order;
import com.example.ordersystemmanagement.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController("orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public void createOrder(Order order) {
        orderService.insertOrder(order);
    }

    @GetMapping
    public List<Order> search() {
        return null;
    }
}
