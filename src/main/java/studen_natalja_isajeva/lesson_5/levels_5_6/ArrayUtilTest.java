package studen_natalja_isajeva.lesson_5.levels_5_6;

import java.util.Arrays;
import java.util.Random;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFundMinNumber();

    }

    // Task 32
    public void shouldCreateArray() {
        ArrayUtil test = new ArrayUtil();
        int[] expectedArrayLength = test.createArray(3);
        int[] actualArrayLength = test.createArray(3);
        if (Arrays.equals(expectedArrayLength, actualArrayLength)) {
            System.out.println("Array length correct");
        } else {
            System.out.println("Array length incorrect");
        }
    }

    // Task 36
    public void shouldFindMaxNumber() {
        ArrayUtil test = new ArrayUtil();
        int[] array = {100, 10, 5, 3, 2};
        int expectedResult = 100;
        int actualResult = test.findMaxNumber(array);
        if (expectedResult == actualResult) {
            System.out.println("MAX is correct ");
        } else {
            System.out.println("MAX is incorrect ");
        }

    }
    //Task 38
    public void shouldFundMinNumber(){
        ArrayUtil test = new ArrayUtil();
        int[] array = {100, 10, 5, 3, 2};
        int expectedResult = 2;
        int actualResult = test.findMinNumber(array);
        if (expectedResult == actualResult) {
            System.out.println("MIN is correct ");
        } else {
            System.out.println("MIN is incorrect ");
        }
    }
}

