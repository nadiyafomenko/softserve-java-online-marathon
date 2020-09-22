package com.softserve.academy.sprint04.task06;

public class EmployeeComparator extends PersonComparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (super.compare(o1, o2) != 0) return super.compare(o1, o2);
        else {
            Employee e1 = (Employee)o1;
            Employee e2 = (Employee)o2;
            return (int) (e1.getSalary() - e2.getSalary());
        }
    }
}
