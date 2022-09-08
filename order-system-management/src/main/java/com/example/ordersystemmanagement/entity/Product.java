package com.example.ordersystemmanagement.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table
@Entity
public class Product {

    @Id
    private long id;
    private String productName;
    private long skuCode;
    private double unitPrice;
}
