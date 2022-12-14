package com.example.ordersystemmanagement.controller;

import com.example.ordersystemmanagement.api.OrderSearch;
import com.example.ordersystemmanagement.api.ProductQuantityChange;
import com.example.ordersystemmanagement.entity.Order;
import com.example.ordersystemmanagement.exception.ProductNotFoundException;
import com.example.ordersystemmanagement.repository.OrderRepository;
import com.example.ordersystemmanagement.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {

    private final OrderService orderService;
    private OrderRepository orderRepository;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public void createOrder(Order order) {
        orderService.insertOrder(order);
    }


    /**
     *
     * @param orderSearch like: {
     *                              "key": "date" / "DATE" / "Product_scu" / ....
     *                              "value: "asdas" / 123 / "13.06.2022"
     *                          }
     * @return list of found orders.
     */
    @GetMapping("search")
    public List<Order> search(@RequestBody OrderSearch orderSearch) {
        try {
            return orderService.search(orderSearch);
        } catch (Exception e) {
            throw new ProductNotFoundException(orderSearch.getKey() + "is not found.");
        }
    }

    @PutMapping("{id}/change-quantity")
    public Order changeQuantity(@PathVariable long id, @RequestBody ProductQuantityChange productQuantityChange) {
        if(orderRepository.findById(id).isEmpty()) {
            throw new ProductNotFoundException(id + " is not exists.");
        }
        return orderService.changeQuantity(id, productQuantityChange.getProductName(), productQuantityChange.getNewQuantity());
    }
}
