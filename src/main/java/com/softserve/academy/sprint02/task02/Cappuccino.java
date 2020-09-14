package com.softserve.academy.sprint02.task02;

import java.util.Map;

public class Cappuccino extends Caffee {

    public Cappuccino(String name, int rating){
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        this.ingredients.put("Water", 100);
        this.ingredients.put("Arabica", 20);
        this.ingredients.put("Milk", 50);
        return this.ingredients;
    }
}
