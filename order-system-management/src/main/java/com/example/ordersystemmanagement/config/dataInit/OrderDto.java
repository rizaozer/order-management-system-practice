package com.example.ordersystemmanagement.config.dataInit;

import com.example.ordersystemmanagement.entity.OrderLine;
import lombok.Data;
import java.util.List;

@Data
public class OrderDto {
    private List<OrderLine> orderLines;
    private long customerId;
}
