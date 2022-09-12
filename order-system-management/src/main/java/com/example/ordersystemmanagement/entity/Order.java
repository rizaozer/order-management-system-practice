package com.example.ordersystemmanagement.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Table(name = "orders")
@Entity
public class Order {

    @Id
    private long id;
    private LocalDate creationDate;
    @OneToMany
    private List<OrderLine> orderLines;
    @ManyToOne
    private Customer customer;
}
