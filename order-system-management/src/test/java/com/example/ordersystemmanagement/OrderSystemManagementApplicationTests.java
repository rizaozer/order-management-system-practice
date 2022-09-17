package com.example.ordersystemmanagement;

import com.example.ordersystemmanagement.controller.OrderController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class OrderSystemManagementApplicationTests {

    @Autowired
    private OrderController orderController;

    @Test
    void contextLoads() {
        assertThat(orderController).isNotNull();
    }

}
