package com.softserve.academy.sprint02.task03;

public interface Comparable {
   default int getComparator() {
      return 0;
   };
}
