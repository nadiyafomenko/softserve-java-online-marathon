package com.softserve.academy.sprint04.task06;

import java.util.Comparator;

public class PersonComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        return p1.getName().compareTo(p2.getName()) == 0
                ? p1.getAge() - p2.getAge()
                : p1.getName().compareTo(p2.getName());
    }
}
