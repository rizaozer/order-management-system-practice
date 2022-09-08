package com.example.ordersystemmanagement.controller;

import com.example.ordersystemmanagement.entity.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("products")
public class ProductController {

    @PostMapping
    public Product createProduct(Product product) {
        return null;
    }
}
