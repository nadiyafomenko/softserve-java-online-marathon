package com.softserve.academy.sprint02.task03;

import java.util.Objects;

public class Worker extends Person implements Comparable{
    private String workPosition;
    private int experienceYears;

    public String getWorkPosition() {
        return workPosition;
    }

    public int getExperienceYears() {
        return experienceYears;
    }


    public Worker(String name, String workPosition, int experienceYears) {
        super(name);
        this.workPosition = workPosition;
        this.experienceYears = experienceYears;
    }

    @Override
    public int getComparator() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return super.getName() + " " + experienceYears;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
