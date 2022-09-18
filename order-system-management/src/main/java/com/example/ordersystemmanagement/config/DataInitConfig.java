package com.example.ordersystemmanagement.config;

import com.example.ordersystemmanagement.config.dataInit.CustomerDto;
import com.example.ordersystemmanagement.config.dataInit.DataInitObject;
import com.example.ordersystemmanagement.controller.CustomerController;
import com.example.ordersystemmanagement.entity.Customer;
import com.example.ordersystemmanagement.entity.Order;
import com.example.ordersystemmanagement.entity.Product;
import com.example.ordersystemmanagement.repository.CustomerRepository;
import com.example.ordersystemmanagement.repository.OrderRepository;
import com.example.ordersystemmanagement.repository.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@Configuration
public class DataInitConfig {

    @Bean
    public CommandLineRunner initData(OrderRepository orderRepository, CustomerRepository customerRepository,
                                      ProductRepository productRepository, ObjectMapper objectMapper,
                                      ModelMapper modelMapper) throws IOException {
        var resource = new ClassPathResource("static/data.json");
        var inputStream = resource.getInputStream();
        var dataInit = objectMapper.readValue(inputStream, DataInitObject.class);

        dataInit.getCustomers().stream()
                .map(customerDto -> modelMapper.map(customerDto, Customer.class))
                .forEach(customerRepository::save);

        dataInit.getProducts().stream()
                .map(productDto -> modelMapper.map(productDto, Product.class))
                .forEach(productRepository::save);

        dataInit.getOrders().stream()
                .map(orderDto -> modelMapper.map(orderDto, Order.class))
                .forEach(orderRepository::save);

        return args -> {};
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
