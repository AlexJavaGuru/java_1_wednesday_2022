package student_aleksandrs_korsaks.ak_lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {
    ArrayCopy arrayCopy = new ArrayCopy();

    public static void main(String[] args) {
        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.arrayCopyInRangeTest();
        arrayCopyTest.arrayCopyOutOfRangeTest();
    }

    public void arrayCopyInRangeTest() {
        int[] test = {1, 6, -5, 2, 23, 100, -50, 0, 20};
        int[] expectedResult = {1, 6, -5, 2, 23, 0, 20};
        int[] realResult = arrayCopy.copyInRange(test, -10, 23);
        checkTestResult("arrayCopyInRangeTest", Arrays.equals(expectedResult, realResult));
    }

    public void arrayCopyOutOfRangeTest() {
        int[] test = {1, 6, -5, 2, 23, 100, -50, 0, 20};
        int[] expectedResult = {};
        int[] realResult = arrayCopy.copyInRange(test, -100, -60);
        checkTestResult("arrayCopyOutOfRangeTest", Arrays.equals(expectedResult, realResult));
    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }
}
