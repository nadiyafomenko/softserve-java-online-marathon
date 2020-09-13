package com.softserve.academy.sprint01.task06;

public class Product {
    private String name;
    private double price;
    private static int count;

    public Product(){
        count++;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        count++;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public static int count(){
        return count;
    }
}
