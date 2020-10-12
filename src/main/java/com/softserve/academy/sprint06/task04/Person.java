package com.softserve.academy.sprint06.task04;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    DecisionMethod goShopping = (productName, discount) -> productName.equals("product1") && discount > 10;
}
