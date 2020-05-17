package com.github.daria80.example4;

import lombok.*;

@Data
@NoArgsConstructor
public class Cat {
    private String name;
    private int number;

    public Cat(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
