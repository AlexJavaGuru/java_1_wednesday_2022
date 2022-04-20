package student_igors.lesson_6.level_3;

import java.sql.Array;
import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.testContainsTrue();
        test.testContainsFouls();
        test.testCountOccurrencesTrue();
        test.testCountOccurrencesFouls();
        test.testReplaceFirstTrue();
        test.testReplaceFirstFouls();
        test.testReplaceAllTrue();
        test.testReplaceAllFouls();
        test.testRevertArrTrue();
        test.testSort();
    }

    public void testContainsTrue() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        boolean actualResult = subject.contains(arr, 2);
        checkTestResult(actualResult, "Array contains number - True");
    }

    public void testContainsFouls() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        boolean actualResult = subject.contains(arr, 6);
        checkTestResult(actualResult, "Array contains number - Fouls");
    }

    public void testCountOccurrencesTrue() {
        ArrayService subject = new ArrayService();
        int[] arr = {4, 3, 4, 4, 3, 0};
        int expectedResult = 3;
        int actualResult = subject.countOccurrences(arr, 4);
        checkTestResult(expectedResult, actualResult, "Count occurrences test - True");
    }
    public void testCountOccurrencesFouls() {
        ArrayService subject = new ArrayService();
        int[] arr = {4, 3, 4, 4, 3, 0};
        int expectedResult = 2;
        int actualResult = subject.countOccurrences(arr, 4);
        checkTestResult(expectedResult, actualResult, "Count occurrences test - Fouls");
    }
    public void testReplaceFirstTrue() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 6};
        boolean actualResult = subject.replaceFirst(arr, 1, 2);
        checkTestResult(actualResult, "Replacement first test - True");
    }
    public void testReplaceFirstFouls() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 6};
        boolean actualResult = subject.replaceFirst(arr, 1, 2);
        checkTestResult(actualResult, "Replacement first test - Fouls");
    }
    public void testReplaceAllTrue() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 1, 4, 1, 6};
        int expectedResult = 2;
        int actualResult = subject.replaceAll(arr, 1, 3);
        checkTestResult(actualResult, expectedResult, "Replace all number test - True");
    }
    public void testReplaceAllFouls() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 1, 4, 1, 6};
        int expectedResult = 1;
        int actualResult = subject.replaceAll(arr, 1, 2);
        checkTestResult(actualResult, expectedResult, "Replace all number test - Fouls");
    }
    public void testRevertArrTrue() {
        ArrayService subject = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 4, 3, 2, 1};
        subject.revert(arr);
        checkTestResult(expectedResult, arr, "Revert test - True");
    }
    public void testSort() {
        ArrayService subject =new ArrayService();
        int[] arr = {5, 4, 3, 2, 1, 0};
        int[] expectedResult = {0, 1, 2, 3, 4, 5};
        subject.sort(arr);
        checkTestResult(expectedResult, arr, "Sorting test");
    }


    void checkTestResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " Passed");
        } else {
            System.out.println(testName + " Failed");
        }
    }
    void checkTestResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " Passed");
        } else {
            System.out.println(testName + " Failed");
        }
    }
    void checkTestResult(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " Passed");
        } else {
            System.out.println(testName + " Failed");
        }
    }
}



