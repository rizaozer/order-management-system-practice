package com.example.ordersystemmanagement.config.dataInit;

import com.example.ordersystemmanagement.entity.Customer;
import com.example.ordersystemmanagement.entity.Order;
import com.example.ordersystemmanagement.entity.Product;
import lombok.Data;
import java.util.List;

@Data
public class DataInitObject {

    private List<Customer> customers;
    private List<Order> orders;
    private List<Product> products;
}
