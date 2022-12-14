package com.example.ordersystemmanagement.service;

import com.example.ordersystemmanagement.api.OrderSearch;
import com.example.ordersystemmanagement.entity.Order;
import com.example.ordersystemmanagement.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public void insertOrder(Order order) {
        orderRepository.save(order);
    }

    public List<Order> search() {
        return null;
    }

    public Order changeQuantity(long id, String productName, int newQuantity) {
        Optional<Order> order = orderRepository.findById(id);

        if (order.isEmpty()) {
            return null;
        }

        order.get().getOrderLines().stream()
                .filter(orderLine -> orderLine.getProduct().getProductName().equals(productName))
                .findFirst()
                .ifPresent(orderLine -> orderLine.setQuantity(newQuantity));

        return orderRepository.save(order.get());
    }

    public List<Order> search(OrderSearch orderSearch) {
        return switch (orderSearch.getKey()) {
            case DATE -> orderRepository.findAllByCreationDate(orderSearch.getDateValue());
            case CUSTOMER -> orderRepository.findAllByCustomerName(orderSearch.getStringValue());
            case PRODUCT_NAME -> orderRepository.findAllByProductName(orderSearch.getStringValue());
            case SKU_CODE -> orderRepository.findAllByProductSkuCode(orderSearch.getIntegerValue());
        };
    }

}
