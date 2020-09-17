package com.softserve.academy.sprint02.task02;

import java.util.Map;

public class Cappuccino extends Caffee {

    public Cappuccino(String name, int rating){
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        addComponent("Water", 100);
        addComponent("Arabica", 20);
        addComponent("Milk", 50);
        return this.ingredients;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
