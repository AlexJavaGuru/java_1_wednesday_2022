package student_jekaterina_soldatova.lesson06.level01.level_3_junior;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        int[] testArray = {0, 1, 2, 3, 3, 4, 1, 0};

        test.arrayIncludesNumberPositive(testArray);
        test.arrayIncludesNumberNegative(testArray);

        test.arrayIncludesNumberCountTimes(testArray);
//        test.ChangeOneNumberInArrayFirst(testArray);
//        test.ChangeOneNumberInArrayAllInstances(testArray);
        test.ReverseArray();

    }

    void arrayIncludesNumberPositive(int[] array) {
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.ArrayIncludesNumber(array, 1);
        if (realResult == expectedResult) {
            System.out.println("Includes number test = OK");
        } else {
            System.out.println("Includes number test = FAIL");
        }
    }

    void arrayIncludesNumberNegative(int[] array) {
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.ArrayIncludesNumber(array, 6);
        if (realResult == expectedResult) {
            System.out.println("Does not include number test = OK");
        } else {
            System.out.println("Does not include number test = FAIL");
        }
    }

    void arrayIncludesNumberCountTimes(int[] array) {
        int expectedResult = 2;
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.ArrayIncludesNumberCountTimes(array, 0);
        if (realResult == expectedResult) {
            System.out.println("How many times includes number test = OK");
        } else {
            System.out.println("How many times includes number test = FAIL");
        }
    }

    void ChangeOneNumberInArrayFirst(int[] array) {
        int[] expectedResult = {6, 1, 2, 3, 3, 4, 1, 0};
        ArrayService arrayService = new ArrayService();
        arrayService.ChangeOneNumberInArrayFirst(array, 0, 6);
        int[] realResult = array;
        if (CompareArrays(realResult, expectedResult)) {
            System.out.println("Change first instance of the number in the array test = OK");
        } else {
            System.out.println("Change first instance of the number in the array test = FAIL");

        }
    }

    private void ChangeOneNumberInArrayAllInstances(int[] array) {
        int[] expectedResult = {6, 1, 2, 3, 3, 4, 1, 6};
        ArrayService arrayService = new ArrayService();
        arrayService.ChangeOneNumberInArrayFirst(array, 0, 6);
        int[] realResult = array;
        if (CompareArrays(realResult, expectedResult)) {
            System.out.println("Change all instances of the number in the array test = OK");
        } else {
            System.out.println("Change all instances of the number in the array test = FAIL");

        }
    }

    void ReverseArray() {
        int[] smth = {0, 1, 2, 3};
        int[] expectedResult = {3, 2, 1, 0};
        ArrayService arrayService = new ArrayService();
        System.out.println(Arrays.toString(smth) + "result before method");
        arrayService.ReverseArray(smth);
        int[] realResult = smth;
        System.out.println(Arrays.toString(realResult) + "result after method");
        if (CompareArrays(realResult, expectedResult)) {
            System.out.println("Reverse array test = OK");
        } else {
            System.out.println("Reverse array test = FAIL");

        }
    }


    boolean CompareArrays(int[] realResult, int[] expectedResult) {
        for (int i = 0; i < realResult.length; i++) {
            if (realResult[i] != expectedResult[i]) {
                return false;
            }
        }
        return true;
    }
}
