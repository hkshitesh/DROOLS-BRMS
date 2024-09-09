package com.example.helpers;

import java.util.List;

public class DataHalper {
    private static final List<String> names = List.of(
            "John Doe",
            "Jane Smith",
            "Michael Johnson",
            "Emily Davis",
            "David Wilson",
            "Sarah Brown",
            "Robert Taylor",
            "Jessica Martinez",
            "William Anderson",
            "Sophia Hernandez"
    );

    public static String getRandomName() {
        return names.get((int) (Math.random() * names.size()));
    }
}
