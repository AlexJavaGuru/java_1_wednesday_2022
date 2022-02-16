package student_arturs_melnikovs.lesson_05.level_05;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.testCreateArray();
        test.testMaxNumber();
        test.testMinNumber();

    }

    public void testCreateArray() {
        ArrayUtil util = new ArrayUtil();
        int expectedResult = 10;
        int[] testArray = util.createArray(expectedResult);
        int actualResult = testArray.length;
        checkResult(expectedResult, actualResult, "Create Array test");
    }

    public void testMaxNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] testArray = {-10, 0, 10, 1156, -1569, 224};
        int expectedResult = testArray[3];
        int actualResult = util.findMaxNumber(testArray);
        checkResult(expectedResult, actualResult, "Find Max Number test");
    }

    public void testMinNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] testArray = {-10, 0, 10, 1156, -1569, 224};
        int expectedResult = testArray[4];
        int actualResult = util.findMinNumber(testArray);
        checkResult(expectedResult, actualResult, "Find Min Number test");
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
