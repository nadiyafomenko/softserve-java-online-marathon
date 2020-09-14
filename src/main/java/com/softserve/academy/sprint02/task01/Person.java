package com.softserve.academy.sprint02.task01;

public abstract class Person {
    int age;
    String healthInfo;
    String name;

    public Person(int age, String healthInfo, String name){
        this.age = age;
        this.healthInfo = healthInfo;
        this.name = name;
    }

    String getHealthStatus(){ return name +" " + healthInfo; }
}
