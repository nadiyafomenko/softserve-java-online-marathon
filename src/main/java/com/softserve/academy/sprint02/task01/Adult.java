package com.softserve.academy.sprint02.task01;

public class Adult extends Person {
    String passportNumber;

    public Adult(int age, String healthInfo, String name, String passportNumber){
        super(age, healthInfo, name);
        this.passportNumber = passportNumber;
    }
}
