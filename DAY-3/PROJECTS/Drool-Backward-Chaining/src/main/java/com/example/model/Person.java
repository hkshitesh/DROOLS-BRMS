package com.example.model;

public class Person {
    private String name;
    private int age;
    private boolean eligibleForDiscount;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.eligibleForDiscount = false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isEligibleForDiscount() {
        return eligibleForDiscount;
    }

    public void setEligibleForDiscount(boolean eligibleForDiscount) {
        this.eligibleForDiscount = eligibleForDiscount;
    }
}
