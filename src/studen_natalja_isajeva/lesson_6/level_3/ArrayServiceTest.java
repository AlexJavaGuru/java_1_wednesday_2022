package studen_natalja_isajeva.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.testSearchNumber();
        test.testNotSearchNumber();
        test.testCountOccurrence();
        test.testCountOccurrenceNegative();
        test.testReplaceFirst();
        test.testNonReplaceFirst();
        test.testReplaceAll();
        test.testNotReplaceAll();
    }

    //task 12
    public void testSearchNumber() {
        ArrayService test = new ArrayService();
        int[] array = {100, 10, 5, 3, 2};
        boolean actualResult = test.searchNumber(array, 5);
        if (actualResult) {
            System.out.println("Search umber finded in Massive");
        } else {
            System.out.println("Search number not finded in Massive");
        }
    }

    public void testNotSearchNumber() {
        ArrayService test = new ArrayService();
        int[] array = {100, 10, 5, 3, 2};
        boolean actualResult = test.searchNumber(array, 77);
        if (actualResult) {
            System.out.println("Search umber finded in Massive");
        } else {
            System.out.println("Search number not finded in Massive");
        }
    }

    //task 13
    public void testCountOccurrence() {
        ArrayService test = new ArrayService();
        int[] array = {100, 10, 2, 5, 2};
        int expectedResult = 2;
        int actualResult = test.countOccurrence(array, 2);
        if (expectedResult == actualResult) {
            System.out.println(expectedResult + " Occurrence OK!");
        } else {
            System.out.println(expectedResult + " Occurrence FALSE!");
        }
    }

    public void testCountOccurrenceNegative() {
        ArrayService test = new ArrayService();
        int[] array = {100, 10, 2, 5, 2};
        int expectedResult = 1;
        int actualResult = test.countOccurrence(array, 1);
        if (expectedResult == actualResult) {
            System.out.println(expectedResult + " Occurrence OK!");
        } else {
            System.out.println(expectedResult + " Occurrence FALSE!");
        }
    }

    //task 14
    public void testReplaceFirst() {
        ArrayService test = new ArrayService();
        int[] array = {100, 10, 2, 5, 2};
        boolean actualResult = test.replaceFirst(array, 2, 77);
        if (actualResult) {
            System.out.println("First number replaced!");
        } else {
            System.out.println("First number NOT replaced!");
        }
    }

    public void testNonReplaceFirst() {
        ArrayService test = new ArrayService();
        int[] array = {100, 10, 1, 5, 2};
        boolean actualResult = test.replaceFirst(array, 1, 77);
        if (!actualResult) {
            System.out.println("First number replaced!");
        } else {
            System.out.println("First number NOT replaced!");
        }
    }

    //task 15
    public void testReplaceAll() {
        ArrayService test = new ArrayService();
        int[] array = {100, 10, 2, 5, 2};
        int expectedResult = 2;
        int actualResult = test.replaceAll(array, 2, 4);
        if (expectedResult == actualResult) {
            System.out.println(expectedResult + " All numbers replaced!");
        } else {
            System.out.println(expectedResult + " All numbers not replaced");
        }
    }

    public void testNotReplaceAll() {
        ArrayService test = new ArrayService();
        int[] array = {100, 10, 2, 5, 2};
        int expectedResult = 1;
        int actualResult = test.replaceAll(array, 1, 4);
        if (expectedResult == actualResult) {
            System.out.println(expectedResult + " All numbers replaced!");
        } else {
            System.out.println(expectedResult + " All numbers not replaced");
        }
    }

    }
