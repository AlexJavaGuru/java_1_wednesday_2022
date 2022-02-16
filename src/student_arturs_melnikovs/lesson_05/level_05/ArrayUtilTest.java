package student_arturs_melnikovs.lesson_05.level_05;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.testCreateArray();

    }

    public void testCreateArray() {
        ArrayUtil test = new ArrayUtil();
        int expectedResult = 10;
        int[] testArray = test.createArray(expectedResult);
        int actualResult = testArray.length;
        checkResult(expectedResult, actualResult, "Create Array test");
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
