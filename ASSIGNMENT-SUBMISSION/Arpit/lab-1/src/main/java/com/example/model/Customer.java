package com.example.model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class Customer {
    private final String name;
    private final String membership;
    private int discount;
}
