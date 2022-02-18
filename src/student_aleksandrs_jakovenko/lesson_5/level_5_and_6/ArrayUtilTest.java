package student_aleksandrs_jakovenko.lesson_5.level_5_and_6;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void checkResultArray(int[] actualResult, int[] expectedResult, String testName){
        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void checkResult(int actualResult, int expectedResult, String testName){
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] actualResult = arrayUtil.createArray(5);
        int[] expectedResult = new int[5];
        checkResultArray(actualResult, expectedResult, "Create Array Test");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {-5, 1, 5, 7, 15};
        int actualResult = arrayUtil.findMaxNumber(array);
        int expectedResult = 15;
        checkResult(actualResult, expectedResult, "MaxNumber test");
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {-5, 1, 5, 7, 15};
        int actualResult = arrayUtil.findMinNumber(array);
        int expectedResult = -5;
        checkResult(actualResult, expectedResult, "MinNumber test");
    }
}