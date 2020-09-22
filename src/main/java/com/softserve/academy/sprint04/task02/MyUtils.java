package com.softserve.academy.sprint04.task02;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class MyUtils {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id &&
                    Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public Set<Student> commonStudents(final List<Student> list1, final List<Student> list2) {
        Set<Student> result = new HashSet<>();
        if (list1.equals(list2)) {
            return new HashSet<>(list1);
        }
        list1.forEach(student -> {
            if (list2.contains(student)) {
                result.add(student);
            }
        });
        return result;
    }
}
