package student_andrejs_saldavs.lesson_06.level_3;


import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.isNumberInArrayTest();
        arrayServiceTest.isNumberInNotArrayTest();
        arrayServiceTest.countOccurrencesTestOne();
        arrayServiceTest.countOccurrencesTestTwo();
        arrayServiceTest.countOccurrencesTestThree();
        arrayServiceTest.replacementFirstTest();
        arrayServiceTest.replacementSecondTest();
        arrayServiceTest.replaceAllNumbersTestOne();
        arrayServiceTest.replaceAllNumbersTestTwo();
        arrayServiceTest.inversionTest();
        arrayServiceTest.sortTest();
    }

    public void isNumberInArrayTest() {
        ArrayService detector = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        boolean actualResult = detector.contains(arr, 2);
        checkResult(actualResult, "Test 'is number in array'");
    }

    public void isNumberInNotArrayTest() {
        ArrayService detector = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        boolean actualResult = detector.contains(arr, 8);
        checkResult(!actualResult, "Test 'is number not in array'");
    }

    public void countOccurrencesTestOne() {
        ArrayService detector = new ArrayService();
        int[] arr = {1, 2, 3, 3, 4};
        int expectedResult = 2;
        int actualResult = detector.countOccurrences(arr, 3);
        checkResult(expectedResult, actualResult, "Count occurrences test 1");
    }

    public void countOccurrencesTestTwo() {
        ArrayService detector = new ArrayService();
        int[] arr = {1, 2, 2, 2, 4};
        int expectedResult = 3;
        int actualResult = detector.countOccurrences(arr, 2);
        checkResult(expectedResult, actualResult, "Count occurrences test 2");
    }

    public void countOccurrencesTestThree() {
        ArrayService detector = new ArrayService();
        int[] arr = {2, 3, 4, 5, 6};
        int expectedResult = 0;
        int actualResult = detector.countOccurrences(arr, 1);
        checkResult(expectedResult, actualResult, "Count occurrences test 3");
    }

    public void replacementFirstTest() {
        ArrayService detector = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        boolean actualResult = detector.replaceFirstNumber(arr, 2, 6);
        checkResult(actualResult, "Replacement test 1");
    }

    public void replacementSecondTest() {
        ArrayService detector = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        boolean actualResult = detector.replaceFirstNumber(arr, 9, 7);
        checkResult(!actualResult, "Replacement test 2");
    }

    public void replaceAllNumbersTestOne() {
        ArrayService detector = new ArrayService();
        int[] arr = {1, 3, 4, 5, 5, 5, 6, 6, 8};
        int expectedResult = 3;
        int actualResult = detector.replaceAllNumbers(arr, 5, 9);
        checkResult(expectedResult, actualResult, "Replace all numbers test 1");
    }

    public void replaceAllNumbersTestTwo() {
        ArrayService detector = new ArrayService();
        int[] arr = {1, 3, 4, 5, 5, 5, 6, 6, 8};
        int expectedResult = 0;
        int actualResult = detector.replaceAllNumbers(arr, 2, 9);
        checkResult(expectedResult, actualResult, "Replace all numbers test 2");
    }

    public void inversionTest() {
        ArrayService detector = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 4, 3, 2, 1};
        detector.inversion(arr);
        checkResult(expectedResult, arr, "Revert test");
    }

    public void sortTest() {
        ArrayService detector = new ArrayService();
        int[] arr = { 3, 4, 1, 5, 2, 22, 11, 9, 50};
        int[] expectedResult = {1, 2, 3, 4, 5, 9, 11, 22, 50};
        detector.sortNumbers(arr);
        checkResult(expectedResult, arr, "Sort numbers test");
    }


    void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
        }
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
        }
    }

    void checkResult(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
        }
    }


}
