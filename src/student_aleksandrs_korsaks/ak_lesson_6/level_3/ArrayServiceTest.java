package student_aleksandrs_korsaks.ak_lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsPositiveTest();
        arrayServiceTest.containsNegativeTest();
        arrayServiceTest.countOfContainsPositiveTest();
        arrayServiceTest.countOfContainsNegativeTest();
        arrayServiceTest.replaceFirstNumberPositiveTest();
        arrayServiceTest.replaceFirstNumberNegativeTest();
        arrayServiceTest.replaceAllNumbersPositiveTest();
        arrayServiceTest.replaceAllNumbersNegativeTest();
        arrayServiceTest.replaceAllNumbersPositiveCounterTest();
        arrayServiceTest.replaceAllNumbersNegativeCounterTest();
    }

    public void containsPositiveTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 4, 5};
        boolean result = arrayService.contains(testArr, 4);
        checkTestResult("containsPositiveTest", result);
    }

    public void containsNegativeTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 4, 5};
        boolean result = !arrayService.contains(testArr, 0);
        checkTestResult("containsPositiveTest", result);
    }

    public void countOfContainsNegativeTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 2, 5};
        int expectedResult = 0;
        int realResult = arrayService.countOfContains(testArr, 0);
        checkTestResult("countOfContainsNegativeTest", expectedResult == realResult);
    }

    public void countOfContainsPositiveTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 2, 5};
        int expectedResult = 2;
        int realResult = arrayService.countOfContains(testArr, 2);
        checkTestResult("countOfContainsPositiveTest", expectedResult == realResult);
    }

    public void replaceFirstNumberPositiveTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 2, 5};
        int[] expectedResult = {1, 6, -1, 2, 5};
        arrayService.replaceFirstNumber(testArr, 2, 6);
        checkTestResult("replaceFirstNumberPositiveTest", Arrays.equals(testArr, expectedResult));
    }

    public void replaceFirstNumberNegativeTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 2, 5};
        int[] expectedResult = {1, 2, -1, 2, 5};
        arrayService.replaceFirstNumber(testArr, 7, 6);
        checkTestResult("replaceFirstNumberNegativeTest", Arrays.equals(testArr, expectedResult));
    }

    public void replaceAllNumbersPositiveTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 2, 5};
        int[] expectedResult = {1, 6, -1, 6, 5};
        arrayService.replaceAllNumbers(testArr, 2, 6);
        checkTestResult("replaceAllNumbersPositiveTest", Arrays.equals(testArr, expectedResult));
    }

    public void replaceAllNumbersNegativeTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 2, 5};
        int[] expectedResult = {1, 2, -1, 2, 5};
        arrayService.replaceAllNumbers(testArr, 7, 6);
        checkTestResult("replaceAllNumbersNegativeTest", Arrays.equals(testArr, expectedResult));
    }

    public void replaceAllNumbersPositiveCounterTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 2, 5};
        int expectedResult = 2;
        int realResult = arrayService.replaceAllNumbers(testArr, 2, 6);
        checkTestResult("replaceAllNumbersPositiveCounterTest", expectedResult == realResult);
    }

    public void replaceAllNumbersNegativeCounterTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 2, 5};
        int expectedResult = 0;
        int realResult = arrayService.replaceAllNumbers(testArr, 7, 6);
        checkTestResult("replaceAllNumbersNegativeCounterTest", expectedResult == realResult);
    }

    public void checkTestResult(String testName, boolean result) {
        if (result) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}
