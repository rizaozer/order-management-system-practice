package com.example.ordersystemmanagement.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table
public class OrderLine {

    @Id
    private long id;
    @ManyToOne
    private Product product;
    private int quantity;
}
