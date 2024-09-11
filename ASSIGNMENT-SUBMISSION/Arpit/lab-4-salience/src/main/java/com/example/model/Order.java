package com.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Order {
    private final String name;
    private final String customerType;
    private final String productCategory;
    private double orderAmount;
    private boolean processed;
}
