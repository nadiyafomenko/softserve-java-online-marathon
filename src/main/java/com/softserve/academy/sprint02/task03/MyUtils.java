package com.softserve.academy.sprint02.task03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class MyUtils {
    public static List<Person> maxDuration(List<Person> persons) {
        List<Person> list = new ArrayList<>();
        Student maxStudent = persons.stream()
                .filter(Student.class::isInstance)
                .map(Student.class::cast)
                .max(Comparator.comparing(Student::getStudyYears)).get();
        Worker maxWorker = persons.stream()
                .filter(Worker.class::isInstance)
                .map(Worker.class::cast)
                .max(Comparator.comparing(Worker::getExperienceYears)).get();
        list.add(maxStudent);
        list.add(maxWorker);
        return list;
    }

    public static void main(String... args) {
        List<Person> list = new ArrayList<>();
        Student s1 = new Student("Nadiya","place", 123);
        Student s2 = new Student("Vasya","place", 11);
        list.add(s1);
        list.add(s2);
        MyUtils.maxDuration(list);
    }

}
