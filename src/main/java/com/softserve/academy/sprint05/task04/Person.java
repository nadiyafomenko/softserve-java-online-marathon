package com.softserve.academy.sprint05.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Person {
    private String firstName;
    private String lastName;
    private String idCode;

    public void setFirstName(String firstName) {
        if (!Pattern.matches("[A-Z][a-z]+", firstName))
            throw new NameException("Incorrect value " + firstName + " for firstName (should start from upper case and contains only alphabetic characters and symbols -, _)");
        else this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (!Pattern.matches("[A-Z][a-z]+", lastName))
            throw new NameException("Incorrect value " + lastName + " for firstName (should start from upper case and contains only alphabetic characters and -, space symbol;)");
        else this.lastName = lastName;
    }

    public void setIdCode(String idCode) {
        if (!Pattern.matches("[0-9]{10}", idCode))
            throw new CodeException("Incorrect value " + idCode + " for code (should contains exactly 10 digits)");
        else this.idCode = idCode;
    }

    public static Person buildPerson(String firstName, String lastName, String idCode) {
        Person person = new Person();
        List<String> errors = new ArrayList<>();

        try {
            person.setFirstName(firstName);
        } catch (NameException | CodeException e) {
            errors.add(e.getMessage());
        }
        try {
            person.setLastName(lastName);
        } catch (NameException e) {
            errors.add(e.getMessage());
        }
        try {
            person.setIdCode(idCode);
        } catch (CodeException e) {
            errors.add(e.getMessage());
        }

        if(!errors.isEmpty())
            throw new IllegalArgumentException(String.join("; ", errors));

        return person;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + idCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(idCode, person.idCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, idCode);
    }

    public static void main(String[] args) {
        Person.buildPerson("io", "Oros", "23");
    }
}
