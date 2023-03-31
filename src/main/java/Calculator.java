package com.knoldus;

public class Calculator {
    int additionOfNumbers(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    int subtractionOfNumbers(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    int multiplicationOfNumbers(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    int divisionOfNumbers(int numberOne, int numberTwo) {
        try {
            return numberOne / numberTwo;
        } catch (Exception exception) {
            System.out.println(exception);
            return -1;
        }
    }
}
