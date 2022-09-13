package com.example.ordersystemmanagement.api;

import java.time.LocalDate;
import java.util.Objects;

public class OrderSearch {

    private String key;
    private String value;

    public OrderSearchParam getKey() {
        return OrderSearchParam.from(key);
    }

    public String getStringValue() {
        return Objects.toString(value);
    }

    public Integer getIntegerValue() {
        try {
            return Integer.parseInt(getStringValue());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public LocalDate getDateValue() {
        return LocalDate.parse(getStringValue());
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
