package com.softserve.academy.sprint04.task06;

enum Level {
    JUNIOR, MIDDLE, SENIOR
}

public class Developer extends Person {
    private Level level;

    public Developer(String name, int age, Level level) {
        super(name, age);
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return  super.toString() + ", Level = " + level;
    }
}
