package com.softserve.academy.sprint02.task05;

public class Square implements Figure {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return width * 4;
    }
}
