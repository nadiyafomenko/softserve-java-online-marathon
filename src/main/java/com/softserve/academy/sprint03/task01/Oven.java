package com.softserve.academy.sprint03.task01;

public class Oven {
    public static Pizza cook(){
        return Pizza.base().addCheese("cheeze").addMeat("meat").addMushroom("mushroom").build();
    }
}
