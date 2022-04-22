package student_aleksandr_zuk.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.hasNumberPositive();
        test.hasNumberNegative();
        test.countOccurrencesPositive();
        test.countOccurrencesNegative();
        test.countOccurrencesZero();


    }

    public void hasNumberPositive(){
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 3, 15, 1};
        boolean realResult = arrayService.contains(array, 1);
        checkResult(realResult, expectedResult, "hasNumberPositive");
    }

    public void hasNumberNegative(){
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        int[] array = {-3, 5, -25, 11};
        boolean realResult = arrayService.contains(array, -25);
        checkResult(realResult, expectedResult, "hasNumberNegative");
    }

    public void countOccurrencesPositive(){
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 5, -11, 2, -4, 2, -6};
        int realResult = arrayService.countOccurrences(array, 2);
        checkResultInt(realResult, expectedResult, "countOccurrencesPositive");
    }

    public void countOccurrencesNegative(){
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        int[] array = {-2, 5, -11, -2, -2, 4, 6};
        int realResult = arrayService.countOccurrences(array, -2);
        checkResultInt(realResult, expectedResult, "countOccurrencesNegative");
    }

    public void countOccurrencesZero(){
        int expectedResult = 0;
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 5, 1, -5, -66, 25};
        int realResult = arrayService.countOccurrences(array, -55);
        checkResultInt(realResult, expectedResult, "countOccurrencesZero");
    }

    public void replaceFirstPositive(){
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 5, -1, -5, 2, 25};
        boolean realResult = arrayService.replaceFirst(array, 2, 3);
        checkResult(realResult, expectedResult, "replaceFirstPositive");
    }


    public void replaceFirstNegative(){
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 5, -1, -5, -1, 25};
        boolean realResult = arrayService.replaceFirst(array, -1, -55);
        checkResult(realResult, expectedResult, "replaceFirstNegative");
    }

    public void replaceFirstZero(){
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 5, -1, -5, -1, 25};
        boolean realResult = arrayService.replaceFirst(array, 18, 9);
        checkResult(realResult, expectedResult, "replaceFirstZero");
    }

    public void replaceAllPositive(){
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 5, 2, -1, 2, -2, 6};
        int realResult = arrayService.replaceAll(array, 2, 15);
        checkResultInt(realResult, expectedResult, "replaceAllPositive");
    }

    public void replaceAllNegative(){
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        int[] array = {-2 , 5, -2, -1, -2, 2, 6};
        int realResult = arrayService.replaceAll(array, -2, 9);
        checkResultInt(realResult, expectedResult, "replaceAllNegative");
    }

    public void replaceAllZero(){
        int expectedResult = 0;
        ArrayService arrayService = new ArrayService();
        int[] array = {2, 5, 2, -1, 2, -2, 6};
        int realResult = arrayService.replaceAll(array, 8, 12);
        checkResultInt(realResult, expectedResult, "replaceAllZero");
    }

    public void revertTest(){
        int[] expectedResult = {2, -5, 3, -4, 1};
        ArrayService arrayService = new ArrayService();
        int[] array = {1, -4, 3, -5, 2};
        arrayService.revert(array);
        checkResultArray(array, expectedResult, "revertTest");
    }


    public void checkResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult){
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
    public void checkResultInt(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAILED");
        }

    }

    public void checkResultArray(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)){
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}