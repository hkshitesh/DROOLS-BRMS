package com.example.model;

import lombok.*;
import org.kie.api.definition.type.PropertyReactive;

@Getter
@Setter
@ToString
@Builder
public class Order {
    private final String name;
    private final Product product;
    private final int quantity;
    private double totalPrice;
    private boolean discountApplied;
}
