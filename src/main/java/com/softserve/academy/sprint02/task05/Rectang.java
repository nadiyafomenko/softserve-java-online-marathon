package com.softserve.academy.sprint02.task05;

public class Rectang implements Figure {
    private double width;
    private double height;

    public Rectang(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
