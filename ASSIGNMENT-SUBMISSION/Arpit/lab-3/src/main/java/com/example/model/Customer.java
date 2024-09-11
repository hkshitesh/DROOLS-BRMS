package com.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Customer {
    private final String name;
    private int loyaltyPoints;
    private String membership;
}
