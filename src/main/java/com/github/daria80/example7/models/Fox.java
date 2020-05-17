package com.github.daria80.example7.models;

import java.util.Objects;

public class Fox {
    private String name;
    private int number;

    public Fox() {
    }

    public Fox(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fox fox = (Fox) o;
        return number == fox.number &&
                Objects.equals(name, fox.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
