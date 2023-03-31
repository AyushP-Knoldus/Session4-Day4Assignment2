package com.knoldus;

import java.util.ArrayList;

public class Storage {
    ArrayList<Integer> arrayOfIntegers = new ArrayList<>();

    ArrayList<Integer> addElement(int element) {
        arrayOfIntegers.add(element);
        return arrayOfIntegers;
    }

    boolean removeElement(int element) {
        if (checkIfContains(element)) {
            return arrayOfIntegers.remove((Integer) element);
        } else {
            return false;
        }
    }

    ArrayList<Integer> removeAll() {
        arrayOfIntegers.clear();
        return arrayOfIntegers;
    }

    boolean checkIfContains(int element) {
        return arrayOfIntegers.contains(element);
    }
}
