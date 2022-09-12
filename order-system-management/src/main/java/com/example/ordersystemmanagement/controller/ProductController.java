package com.example.ordersystemmanagement.controller;

import com.example.ordersystemmanagement.entity.Product;
import com.example.ordersystemmanagement.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void createProduct(Product product) {
        productService.insertProduct(product);
    }
}
