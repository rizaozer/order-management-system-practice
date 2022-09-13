package com.example.ordersystemmanagement.api;

public enum OrderSearchParam {

    DATE,
    CUSTOMER,
    PRODUCT_NAME,
    SKU_CODE;

    public static OrderSearchParam from(String key) {
        for (var val : OrderSearchParam.values()) {
            if(val.name().equalsIgnoreCase(key)) {
                return val;
            }
        }
        return null;
    }

}
