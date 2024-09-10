package com.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class PersonCopy {
    private final String name;
    private int age;
    private boolean hasBirthdayPassed;

    public static PersonCopy copyOf(Person person) {
        return PersonCopy.builder().name(person.getName()).age(person.getAge()).build();
    }
}
