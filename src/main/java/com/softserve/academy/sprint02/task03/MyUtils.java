package com.softserve.academy.sprint02.task03;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


public class MyUtils {
    public List<Person> maxDuration(List<Person> persons) {
        List<Person> list = new ArrayList<>();
        Map<String, List<Person>> map = persons.stream().distinct().filter(Objects::nonNull)
                .filter(p -> p instanceof Student || p instanceof Worker)
                .collect(Collectors.groupingBy(person -> person.getClass().toString()));

        for (Map.Entry<String, List<Person>> entry : map.entrySet()) {
            int max = entry.getValue().stream().mapToInt(Person::getComparator).max().getAsInt();
            list.addAll(entry.getValue().stream().filter(person -> person.getComparator() == max).collect(Collectors.toList()));

        }
        return list;
    }

    public static void main(String... args) {
        List<Person> originList = new ArrayList<>();
        originList.add(new Person("Ivan"));
        originList.add(new Student("Petro", "University", 3));
        originList.add(new Worker("Andriy", "Developer", 12));
        originList.add(new Student("Stepan", "College", 4));
        originList.add(new Worker("Ira", "Manager", 8));
        originList.add(new Student("Ihor", "University", 4));
        originList.add(new Student("Ihor", "University", 4));
        List<Person> expected = new ArrayList<>();
        expected.add(new Worker("Andriy", "Developer", 12));
        expected.add(new Student("Stepan", "College", 4));
        expected.add(new Student("Ihor", "University", 4));
        List<Person> actual = new MyUtils().maxDuration(originList);
        System.out.println(actual);
    }
}


//
//    public static void main(String... args) {
//        List<Person> list = new ArrayList<>();
//        Student s1 = new Student("Nadiya", "place", 123);
//        Student s2 = new Student("Vasya", "place", 11);
//        Worker w1 = new Worker("Worker", "house", 12);
//        Person p1 = new Person("Person");
//        list.add(s1);
//        list.add(w1);
//        list.add(p1);
//        list.add(s2);
//        MyUtils.maxDuration(list);
//    }
//            List<Person> list = new ArrayList<>();
//        Student maxStudent = persons.stream()
//                .filter(Student.class::isInstance)
//                .map(Student.class::cast)
//                .max(Comparator.comparing(Student::getStudyYears)).get();
//        Worker maxWorker = persons.stream()
//                .filter(Worker.class::isInstance)
//                .map(Worker.class::cast)
//                .max(Comparator.comparing(Worker::getExperienceYears)).get();
//        list.add(maxStudent);
//        list.add(maxWorker);
//        return list;
