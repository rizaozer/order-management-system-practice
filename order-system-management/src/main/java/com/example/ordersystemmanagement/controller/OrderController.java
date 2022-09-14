package com.example.ordersystemmanagement.controller;

import com.example.ordersystemmanagement.api.ProductQuantityChange;
import com.example.ordersystemmanagement.entity.Order;
import com.example.ordersystemmanagement.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
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

    @PutMapping("{id}/change-quantity")
    public Order changeQuantity(@PathVariable long id, @RequestBody ProductQuantityChange productQuantityChange) {
        return orderService.changeQuantity(id, productQuantityChange.getProductName(), productQuantityChange.getNewQuantity());
    }
}
