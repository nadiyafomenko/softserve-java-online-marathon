package com.softserve.academy.sprint01.task02;

public class Employee {
    public String fullName;
    public float salary;

    public static void main(String[] args) {
        Employee  emp1 = new Employee ();
        Employee  emp2 = new Employee ();

        emp1.fullName = "Fomenko Nadiya";
        emp1.salary = 300;

        emp2.fullName = "John Doe";
        emp2.salary = 1023;

        Employee[] employees = new Employee[2];
        employees[0] = emp1;
        employees[1] = emp2;


        String[] str = new String[2];
        int i = 0;

        for(Employee emp : employees) {
            str[i] = "{fullName: " + "\"" + emp.fullName + "\"" +", salary: " + emp.salary + "}";
            i++;
        }
        String employeesInfo = "[" + str[0] + ", " + str[1] + "]";

        System.out.println(employeesInfo);
    }
}
