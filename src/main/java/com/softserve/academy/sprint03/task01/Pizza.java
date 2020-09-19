package com.softserve.academy.sprint03.task01;

public class Pizza {
    private static String cheese;
    private static String meat;
    private static String seafood;
    private static String vegetable;
    private static String mushroom;

    private Pizza() { }

    public String getCheese() {
        return cheese;
    }

    public String getMeat() {
        return meat;
    }
    public String getSeafood() {
        return seafood;
    }
    public String getVegetable() {
        return vegetable;
    }
    public String getMushroom() {
        return mushroom;
    }

    public static PizzaBuilder base() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        Pizza pizza;
        private PizzaBuilder() { }

        public PizzaBuilder addCheese(String cheese){
            Pizza.cheese = cheese;
            return this;
        }

        public PizzaBuilder addMeat(String meat){
            Pizza.meat = meat;
            return this;
        }

        public PizzaBuilder addSeafood(String seafood){
            Pizza.seafood = seafood;
            return this;
        }
        public PizzaBuilder addVegetable(String vegetable){
            Pizza.vegetable = vegetable;
            return this;
        }
        public PizzaBuilder addMushroom(String mushroom){
            Pizza.mushroom = mushroom;
            return this;
        }
        public Pizza build(){
            return new Pizza();
        }
    }
}
