package student_aleksandrs_jakovenko.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.hasNumberPositive();
        test.hasNumberNegative();
        test.countOccurrencesPositive();
        test.countOccurrencesNegative();
        test.countOccurrencesZero();
        test.replaceFirstPositive();
        test.replaceFirstNegative();
        test.replaceFirstNothing();
        test.replaceAllPositive();
        test.replaceAllNegative();
        test.replaceAllNothing();
        test.revertTest();
    }

    public void hasNumberPositive() {
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        int[] array = {5, 2, 34, 1};
        boolean realResult = arrayService.contains(array,1);
        checkResult(realResult, expectedResult, "hasNumberPositive");
    }

    public void hasNumberNegative() {
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        int[] array = {-5, 2, -34, 1};
        boolean realResult = arrayService.contains(array, -34);
        checkResult(realResult, expectedResult, "hasNumberNegative");
    }

    public void countOccurrencesPositive() {
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        int[] array = {-5, 2, -34, 1, 2, 2, 3};
        int realResult = arrayService.countOccurrences(array, 2);
        checkResultInt(realResult, expectedResult, "countOccurrencesPositive");
    }

    public void countOccurrencesNegative() {
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        int[] array = {-5, 2, -34, 1, -5, -3, -5};
        int realResult = arrayService.countOccurrences(array, -5);
        checkResultInt(realResult, expectedResult, "countOccurrencesNegative");
    }

    public void countOccurrencesZero() {
        int expectedResult = 0;
        ArrayService arrayService = new ArrayService();
        int[] array = {-5, 2, -34, 1, -5, -3, -5};
        int realResult = arrayService.countOccurrences(array, 77);
        checkResultInt(realResult, expectedResult, "countOccurrencesZero");
    }

    public void replaceFirstPositive() {
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        int[] array = {5, 2, -7, 34, 2, 1};
        boolean realResult = arrayService.replaceFirst(array, 2, 77);
        checkResult(realResult, expectedResult, "replaceFirstPositive");
    }

    public void replaceFirstNegative() {
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        int[] array = {5, 2, -7, 34, -7, 1};
        boolean realResult = arrayService.replaceFirst(array, -7, -77);
        checkResult(realResult, expectedResult, "replaceFirstNegative");
    }

    public void replaceFirstNothing() {
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        int[] array = {5, 2, -7, 34, -7, 1};
        boolean realResult = arrayService.replaceFirst(array, 100, -77);
        checkResult(realResult, expectedResult, "replaceFirstNothing");
    }

    public void replaceAllPositive() {
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        int[] array = {-5, 2, -34, 1, 2, -3, 2, -5};
        int realResult = arrayService.replaceAll(array, 2, 777);
        checkResultInt(realResult, expectedResult, "replaceAllPositive");
    }

    public void replaceAllNegative() {
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        int[] array = {-5, -2, -34, 1, -2, -3, -2, -5};
        int realResult = arrayService.replaceAll(array, -2, 777);
        checkResultInt(realResult, expectedResult, "replaceAllNegative");
    }

    public void replaceAllNothing() {
        int expectedResult = 0;
        ArrayService arrayService = new ArrayService();
        int[] array = {-5, 2, -34, 1, 2, -3, 2, -5};
        int realResult = arrayService.replaceAll(array, 111, 777);
        checkResultInt(realResult, expectedResult, "replaceAllNothing");
    }

    public void revertTest() {
        int[] expectedResult = {5, 4, 3, 2, 1};
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        arrayService.revert(array);
        checkResultArray(array, expectedResult, "revertTest");
    }

    public void checkResult(boolean realResult, boolean expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void checkResultInt(int realResult, int expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    void checkResultArray(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
