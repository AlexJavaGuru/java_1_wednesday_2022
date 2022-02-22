package student_jelena_boicova.lesson_5_homework;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil test = new ArrayUtil();
        int[] expectedArrayLength = test.createArray(9);
        int[] actualArrayLength = test.createArray(9);
        if (Arrays.equals(expectedArrayLength,actualArrayLength)) {
            System.out.println("Array Length is correct");
        } else {
            System.out.println("Array Length is wrong");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil test = new ArrayUtil();
        int[] number  = {3, 5, 7, 9, 8, 2 };
        int expectedResult = 9;
        int actualResult = test.findMaxNumber(number);
        if (expectedResult == actualResult){
            System.out.println("Max number is correct");
        } else {
            System.out.println("Max number is wrong");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil test = new ArrayUtil();
        int[] number  = {3, 5, 7, 9, 8, 2 };
        int expectedResult = 2;
        int actualResult = test.findMinNumber(number);
        if (expectedResult == actualResult){
            System.out.println("Min number is correct");
        } else {
            System.out.println("Min number is wrong");
        }
    }
}



