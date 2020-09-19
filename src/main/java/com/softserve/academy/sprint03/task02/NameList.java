package com.softserve.academy.sprint03.task02;

public class NameList {
    private String[] names = {"Mile", "Emily", "Nick", "Patric", "Sara"};

    public Iterator getIterator() {
        return new Iterator();
    }

    public class Iterator {
        private int counter = 0;

        private Iterator() {
        }

        public boolean hasNext() {
            return counter < names.length;
        }

        public String next() {
            return names[counter++];
        }
    }
}
