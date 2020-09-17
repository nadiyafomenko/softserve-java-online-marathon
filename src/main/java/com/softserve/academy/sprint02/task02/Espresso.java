package com.softserve.academy.sprint02.task02;

import java.util.Map;

public class Espresso extends Caffee {

    public Espresso(String name, int rating){
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        addComponent("Water", 50);
        addComponent("Arabica", 20);
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
