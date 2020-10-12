package com.softserve.academy.sprint08.task01;

public class Class1 {
    @CamelCase
    public void InCorrect() {
    }

    @CamelCase
    public void correct() {
    }

    public void JustMethod() {
    }

    public static void main(String[] args) {
        new CheckCamelCase().checkAndPrint(Class1.class);
    }
}
