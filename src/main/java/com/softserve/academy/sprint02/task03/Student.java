package com.softserve.academy.sprint02.task03;

import java.util.Objects;

public class Student extends Person implements Comparable{
    private String studyPlace;
    private int studyYears;

    public Student(String name, String studyPlace, int studyYears) {
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;
    }

    public int getStudyYears() {
        return studyYears;
    }

    public String getStudyPlace() {
        return studyPlace;
    }

    @Override
    public int getComparator() {
        return studyYears;
    }

    @Override
    public String toString() {
        return super.getName() + " " + studyYears;
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
