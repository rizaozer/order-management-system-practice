package com.example.ordersystemmanagement.service;

import com.example.ordersystemmanagement.entity.Order;
import com.example.ordersystemmanagement.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public void insertOrder(Order order) {
        orderRepository.save(order);
    }

    public List<Order> search() {
        return null;
    }
}
