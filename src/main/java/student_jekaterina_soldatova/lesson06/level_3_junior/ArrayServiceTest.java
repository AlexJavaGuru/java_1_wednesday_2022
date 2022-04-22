package student_jekaterina_soldatova.lesson06.level_3_junior;


class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        int[] testArray = {0, 1, 2, 3, 3, 4, 1, 0};

        test.arrayIncludesNumberPositive(testArray);
        test.arrayIncludesNumberNegative(testArray);

        test.arrayIncludesNumberCountTimes(testArray);
        test.arrayIncludesNumberCountTimesNone(testArray);

        test.changeOneNumberInArrayFirst(testArray);
        test.changeOneNumberInArrayFirstNone(testArray);

        test.changeOneNumberInArrayAllInstances(testArray);
        test.changeOneNumberInArrayAllInstancesNone(testArray);

        test.reverseArray(testArray);
        test.sortArray(testArray);


    }

    void arrayIncludesNumberPositive(int[] array) {
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.arrayIncludesNumber(array, 1);
        if (realResult == expectedResult) {
            System.out.println("Includes number test = OK");
        } else {
            System.out.println("Includes number test = FAIL");
        }
    }

    void arrayIncludesNumberNegative(int[] array) {
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.arrayIncludesNumber(array, 6);
        if (realResult == expectedResult) {
            System.out.println("Does not include number test = OK");
        } else {
            System.out.println("Does not include number test = FAIL");
        }
    }

    void arrayIncludesNumberCountTimes(int[] array) {
        int expectedResult = 2;
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.arrayIncludesNumberCountTimes(array, 0);
        if (realResult == expectedResult) {
            System.out.println("How many times includes number test = OK");
        } else {
            System.out.println("How many times includes number test = FAIL");
        }
    }

    void arrayIncludesNumberCountTimesNone(int[] array) {
        int expectedResult = 0;
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.arrayIncludesNumberCountTimes(array, 8);
        if (realResult == expectedResult) {
            System.out.println("How many times includes number test = OK");
        } else {
            System.out.println("How many times includes number test = FAIL");
        }
    }

    void changeOneNumberInArrayFirst(int[] originalArray) {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest test = new ArrayServiceTest();

        int[] expectedResult = {6, 1, 2, 3, 3, 4, 1, 0};
        int[] array = new int[originalArray.length];
        test.copyArray(originalArray, array);

        arrayService.changeOneNumberInArrayFirst(array, 0, 6);

        int[] realResult = array;
        if (compareArrays(realResult, expectedResult)) {
            System.out.println("Change first instance of the number in the array test = OK");
        } else {
            System.out.println("Change first instance of the number in the array test = FAIL");

        }
    }

    void changeOneNumberInArrayFirstNone(int[] originalArray) {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest test = new ArrayServiceTest();

        int[] expectedResult = originalArray;

        int[] array = new int[originalArray.length];
        test.copyArray(originalArray, array);

        arrayService.changeOneNumberInArrayFirst(array, 8, 6);
        int[] realResult = array;

        if (compareArrays(realResult, expectedResult)) {
            System.out.println("Change first instance of the number in the array test(no number) = OK");
        } else {
            System.out.println("Change first instance of the number in the array test(no number) = FAIL");

        }
    }

    void changeOneNumberInArrayAllInstances(int[] originalArray) {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest test = new ArrayServiceTest();

        int[] expectedResult = {6, 1, 2, 3, 3, 4, 1, 6};
        int[] array = new int[originalArray.length];
        test.copyArray(originalArray, array);

        arrayService.changeOneNumberInArrayAllInstances(array, 0, 6);

        int[] realResult = array;
        if (compareArrays(realResult, expectedResult)) {
            System.out.println("Change all instances of the number in the array test = OK");
        } else {
            System.out.println("Change all instances of the number in the array test = FAIL");

        }
    }

    void changeOneNumberInArrayAllInstancesNone(int[] originalArray) {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest test = new ArrayServiceTest();

        int[] expectedResult = originalArray;
        int[] array = new int[originalArray.length];
        test.copyArray(originalArray, array);

        arrayService.changeOneNumberInArrayAllInstances(array, 8, 6);

        int[] realResult = array;

        if (compareArrays(realResult, expectedResult)) {
            System.out.println("Change all instances of the number in the array test(no number) = OK");
        } else {
            System.out.println("Change all instances of the number in the array test(no number) = FAIL");

        }
    }

    void reverseArray(int[] originalArray) {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest test = new ArrayServiceTest();

        int[] expectedResult = {0, 1, 4, 3, 3, 2, 1, 0};
        int[] array = new int[originalArray.length];
        test.copyArray(originalArray, array);

        arrayService.reverseArray(array);
        int[] realResult = array;

        if (compareArrays(realResult, expectedResult)) {
            System.out.println("Reverse array test = OK");
        } else {
            System.out.println("Reverse array test = FAIL");

        }
    }

    void sortArray(int[] originalArray) {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest test = new ArrayServiceTest();

        int[] expectedResult = {0, 0, 1, 1, 2, 3, 3, 4};
        int[] array = new int[originalArray.length];
        test.copyArray(originalArray, array);

        arrayService.sortArray(array);
        int[] realResult = array;
        if (compareArrays(realResult, expectedResult)) {
            System.out.println("Sort array test = OK");
        } else {
            System.out.println("Sort array test = FAIL");

        }
    }


    boolean compareArrays(int[] realResult, int[] expectedResult) {
        for (int i = 0; i < realResult.length; i++) {
            if (realResult[i] != expectedResult[i]) {
                return false;
            }
        }
        return true;
    }

    void copyArray(int[] originalArray, int[] copiedArray) {
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
    }
}
