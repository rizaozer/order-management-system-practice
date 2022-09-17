package com.example.ordersystemmanagement.config.dataInit;

import lombok.Data;

@Data
public class CustomerDto {

    private long id;
    private long registrationCode;
    private String customerName;
    private String email;
    private String phoneNumber;
}
