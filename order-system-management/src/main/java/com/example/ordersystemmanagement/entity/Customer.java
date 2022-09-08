package com.example.ordersystemmanagement.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Table
@Entity
public class Customer {

    @Id
    private long id;
    private long registrationCode;
    private String customerName;
    private String email;
    private String phoneNumber;
    @OneToMany
    private List<Order> orders;
}
