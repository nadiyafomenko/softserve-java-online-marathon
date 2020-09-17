package com.softserve.academy.sprint02.task02;

public interface DrinkReceipt {
    String getName();
    DrinkReceipt addComponent(String componentName, int componentCount);
}
