package com.example.model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class Person {
    private final String name;
    private int age;
    private boolean hasBirthdayPassed;
}
