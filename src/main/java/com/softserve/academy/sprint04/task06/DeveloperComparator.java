package com.softserve.academy.sprint04.task06;

public class DeveloperComparator extends PersonComparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (super.compare(o1, o2) != 0) return super.compare(o1, o2);
        else {
            Developer d1 = (Developer) o1;
            Developer d2 = (Developer) o2;
            return d1.getLevel().compareTo(d2.getLevel());
        }
    }
}
