package com.softserve.academy.sprint03.task06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

enum SortOrder {
    ASC, DESC
}

public class AddressBook implements Iterable {

    private NameAddressPair[] addressBook;
    private int counter = 0;

    public AddressBook(int capacity) {
        this.addressBook = new NameAddressPair[capacity];
    }

    public boolean create(String firstName, String lastName, String address) {
        if (isPersonExist(firstName, lastName)) {
            update(firstName, lastName, address);
            return false;
        }
        if (counter < addressBook.length) {
            addressBook[counter] = new NameAddressPair(new NameAddressPair.Person(firstName, lastName), address);
            counter++;
            return true;
        } else {
            addressBook = Arrays.copyOf(addressBook, addressBook.length * 2);
            addressBook[counter] = new NameAddressPair(new NameAddressPair.Person(firstName, lastName), address);
            counter++;
            return true;
        }
    }

    private boolean isPersonExist(String firstName, String lastName) {
        return Arrays.stream(addressBook).filter(Objects::nonNull)
                .filter(x -> x.person.lastName.equals(lastName))
                .filter(x -> x.person.firstName.equals(firstName))
                .count() == 1;
    }

    public String read(String firstName, String lastName) {
        try {
            return Arrays.stream(addressBook).filter(Objects::nonNull)
                    .filter(x -> x.person.firstName.equals(firstName))
                    .filter(x -> x.person.lastName.equals(lastName))
                    .findFirst().get().address;
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public boolean update(String firstName, String lastName, String address) {
        try {
            if (!isPersonExist(firstName, lastName)) throw new NoSuchElementException();
            Arrays.stream(addressBook)
                    .filter(x -> x.person.firstName.equals(firstName))
                    .filter(x -> x.person.lastName.equals(lastName))
                    .findFirst()
                    .get().address = address;
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean delete(String firstName, String lastName) {
        try {
            if (!isPersonExist(firstName, lastName)) throw new NoSuchElementException();
            List<NameAddressPair> list = Arrays.stream(addressBook)
                    .filter(Objects::nonNull)
                    .filter(pair -> !pair.person.equals(new NameAddressPair.Person(firstName, lastName)))
                    .collect(Collectors.toList());
            addressBook = list.toArray(addressBook);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public int size() {
        return (int) Arrays.stream(addressBook)
                .filter(Objects::nonNull).count();
    }

    public void sortedBy(SortOrder order) {
        if (order == SortOrder.ASC)
            Arrays.sort(addressBook, new Comparator<NameAddressPair>() {
                @Override
                public int compare(NameAddressPair o1, NameAddressPair o2) {
                    String str1 = o1.person.toString();
                    String str2 = o2.person.toString();
                    return str1.compareTo(str2);
                }
            });
        else
            Arrays.sort(addressBook, new Comparator<NameAddressPair>() {
                @Override
                public int compare(NameAddressPair o1, NameAddressPair o2) {
                    String str1 = o1.person.toString();
                    String str2 = o2.person.toString();
                    return str2.compareTo(str1);
                }
            });
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "addressBook=" + Arrays.toString(addressBook) +
                ", counter=" + counter +
                '}';
    }

    @Override
    public Iterator iterator() {
        return new AddressBookIterator();
    }

    private class AddressBookIterator implements Iterator {
        private int counter = 0;

        public boolean hasNext() {
            return this.counter < size();
        }

        public String next() {
            return addressBook[this.counter++].toString();
        }
    }

    private static class NameAddressPair {
        private final Person person;
        private String address;

        private NameAddressPair(NameAddressPair.Person person, String address) {
            this.person = person;
            this.address = address;
        }

        @Override
        public String toString() {
            return person + ", Address: " + address;
        }

        private static class Person {
            private String firstName;
            private String lastName;

            private Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Person person = (Person) o;
                return Objects.equals(firstName, person.firstName) &&
                        Objects.equals(lastName, person.lastName);
            }

            @Override
            public int hashCode() {
                return Objects.hash(firstName, lastName);
            }

            @Override
            public String toString() {
                return "First name: " + firstName + ", Last name: " + lastName;
            }
        }
    }

    public static void main(String... args) {
         String[] expected = { "First name: Susan, Last name: Brown, Address: Address # 4",
                 "First name: Karen, Last name: Davis, Address: Address #2",
                 "First name: John, Last name: Taylor, Address: Address #1",
                 "First name: John, Last name: Brown, Address: Address #1" };
         String[] actual = new String[4];
         AddressBook addressBook = new AddressBook(4);
         addressBook.create("John", "Brown", "Address #1");
         addressBook.create("Susan", "Brown", "Address # 4");
         addressBook.create("Karen", "Davis", "Address #2");
         addressBook.create("John", "Taylor", "Address #1");
         addressBook.sortedBy(SortOrder.DESC);
        int counter = 0;
        for (Object record : addressBook)
            actual[counter++] = record.toString();
        System.out.println(Arrays.stream(expected).collect(Collectors.toList()));
        System.out.println(Arrays.stream(actual).collect(Collectors.toList()));
        System.out.println(Arrays.equals(expected, actual));
    }
}
