package com.softserve.academy.sprint02.task04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


public class MyUtils {
    public List<Employee> largestEmployees(List<Employee> workers) {
        List<Employee> list = new ArrayList<>();
        Map<String, List<Employee>> map = workers.stream().distinct()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(emp -> emp.getClass().toString()));

        for (List<Employee> entry : map.values()) {

            int maxExperience = entry.stream().mapToInt(Employee::getExperience).max().getAsInt();
            BigDecimal maxPayment = entry.stream().map(Employee::getPayment).reduce(BigDecimal::max).get();

            list.addAll(entry.stream()
                    .filter(employee -> employee.getExperience() == maxExperience || employee.getPayment() == maxPayment)
                    .collect(Collectors.toList()));
        }
        return list;
    }

    public static void main(String... args) {
        List<Employee> originList = new ArrayList<>();
        originList.add(new Employee("Ivan", 10, new BigDecimal(3000.00)));
        originList.add(new Manager("Petro", 9, new BigDecimal(3000.00), 1.5));
        originList.add(new Employee("Stepan", 8, new BigDecimal(4000.00)));
        originList.add(new Employee("Andriy", 7, new BigDecimal(3500.00)));
        originList.add(new Employee("Ihor", 5, new BigDecimal(4500.00)));
        originList.add(new Manager("Vasyl", 8, new BigDecimal(2000.00), 2.0));
        List<Employee> expected = new ArrayList<>();
        expected.add(new Employee("Ivan", 10, new BigDecimal(3000.00)));
        expected.add(new Manager("Petro", 9, new BigDecimal(3000.00), 1.5));
        expected.add(new Employee("Ihor", 5, new BigDecimal(4500.00)));
        List<Employee> actual = new MyUtils().largestEmployees(originList);
        System.out.println(actual);
    }
}
