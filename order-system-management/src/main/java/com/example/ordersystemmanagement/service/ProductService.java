package com.example.ordersystemmanagement.service;

import com.example.ordersystemmanagement.entity.Product;
import com.example.ordersystemmanagement.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public void insertProduct(Product product) {
        productRepository.save(product);
    }
}
