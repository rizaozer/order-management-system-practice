package com.example.ordersystemmanagement.config.dataInit;

import lombok.Data;

@Data
public class ProductDto {

    private long id;
    private String name;
    private int skuCode;
    private double unitPrice;
}
