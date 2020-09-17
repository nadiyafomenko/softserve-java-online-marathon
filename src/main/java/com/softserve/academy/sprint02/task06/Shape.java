package com.softserve.academy.sprint02.task06;

import java.util.Objects;

public abstract class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(name, shape.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
