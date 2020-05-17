package com.github.daria80.example5;

import java.util.Objects;

public class Animal {
    private String type;
    private int number;

    public Animal() {
    }

    public Animal(String type, int number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return number == animal.number &&
                Objects.equals(type, animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, number);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", number=" + number +
                '}';
    }

}
