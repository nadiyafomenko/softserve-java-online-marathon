package com.softserve.academy.sprint01.task05;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getXYPair(){
        int[] pair = new int[2];
        pair[0] = x;
        pair[1] = y;
        return pair;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public double distance(int x, int y){
        double _y = Math.abs(y - this.y);
        double _x = Math.abs(x - this.x);

        return Math.hypot(_y, _x);
    }

    public double distance(Point point){
        double _y = Math.abs(y - point.getY());
        double _x = Math.abs(x - point.getX());

        return Math.hypot(_y, _x);
    }

    public double distance(){
        double _y = Math.abs(y);
        double _x = Math.abs(x);

        return Math.hypot(_y, _x);
    }
}