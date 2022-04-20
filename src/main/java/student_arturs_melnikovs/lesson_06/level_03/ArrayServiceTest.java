package student_arturs_melnikovs.lesson_06.level_03;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest tester = new ArrayServiceTest();
        tester.testContainsTrue();
        tester.testContainsFalse();
        tester.testCountOccurrencesV1();
        tester.testCountOccurrencesV2();
        tester.testNumberReplacementV1();
        tester.testNumberReplacementV2();
        tester.testReplaceAllV1();
        tester.testReplaceAllV2();
        tester.testRevert();
        tester.testSortAscend();
    }

    public void testContainsTrue() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        boolean actualResult = subject.contains(arr, 3);
        checkResult(actualResult, "Contains number test 1");
    }

    public void testContainsFalse() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        boolean actualResult = subject.contains(arr, 6);
        checkResult(!actualResult, "Contains number test 2");
    }

    public void testCountOccurrencesV1() {
        ArrayService subject = new ArrayService();
        int[] arr = {2, 3, 2, 3, 2, 0};
        int expectedResult = 3;
        int actualResult = subject.countOccurrences(arr, 2);
        checkResult(expectedResult, actualResult, "Count occurrences test 1");
    }
    public void testCountOccurrencesV2() {
        ArrayService subject = new ArrayService();
        int[] arr = {2, 3, 2, 3, 2, 0};
        int expectedResult = 0;
        int actualResult = subject.countOccurrences(arr, 4);
        checkResult(expectedResult, actualResult, "Count occurrences test 2");
    }

    public void testNumberReplacementV1() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 3, 3, 4, 5};
        boolean actualResult = subject.replaceFirst(arr, 3, 2);
        checkResult(actualResult, "Number replacement test 1");
    }
    public void testNumberReplacementV2() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 3, 3, 4, 5};
        boolean actualResult = subject.replaceFirst(arr, 10, 2);
        checkResult(!actualResult, "Number replacement test 2");
    }

    public void testReplaceAllV1() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int expectedResult = 3;
        int actualResult = subject.replaceAll(arr, 2, 10);
        checkResult(actualResult, expectedResult, "Replace all test 1");
    }
    public void testReplaceAllV2() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int expectedResult = 0;
        int actualResult = subject.replaceAll(arr, 10, 6);
        checkResult(actualResult, expectedResult, "Replace all test 2");
    }

    public void testRevert() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 4, 3, 2, 1};
        subject.revert(arr);
        checkResult(expectedResult, arr, "Revert test");
    }

    public void testSortAscend() {
        ArrayService subject =new ArrayService();
        int[] arr = {5, 3, 4, 2, 1, 2, 4, 6, 0};
        int[] expectedResult = {0, 1, 2, 2, 3, 4, 4, 5, 6};
        subject.sortAscending(arr);
        checkResult(expectedResult, arr, "Sorting test");
    }

    void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
    void checkResult(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }

}
