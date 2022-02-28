package student_jekaterina_soldatova.lesson06.level01.level_3_junior;


class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        int[] testArray = {0, 1, 2, 3, 3, 4, 1, 0};

        test.arrayIncludesNumberPositive(testArray);
        test.arrayIncludesNumberNegative(testArray);

        test.arrayIncludesNumberCountTimes(testArray);
        test.arrayIncludesNumberCountTimesNone(testArray);

        test.ChangeOneNumberInArrayFirst(testArray);
        test.ChangeOneNumberInArrayFirstNone(testArray);

        test.ChangeOneNumberInArrayAllInstances(testArray);
        test.ChangeOneNumberInArrayAllInstancesNone(testArray);

        test.ReverseArray(testArray);
        test.SortArray(testArray);


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

    void arrayIncludesNumberCountTimesNone(int[] array) {
        int expectedResult = 0;
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.ArrayIncludesNumberCountTimes(array, 8);
        if (realResult == expectedResult) {
            System.out.println("How many times includes number test = OK");
        } else {
            System.out.println("How many times includes number test = FAIL");
        }
    }

    void ChangeOneNumberInArrayFirst(int[] originalArray) {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest test = new ArrayServiceTest();

        int[] expectedResult = {6, 1, 2, 3, 3, 4, 1, 0};
        int[] array = new int[originalArray.length];
        test.CopyArray(originalArray, array);

        arrayService.ChangeOneNumberInArrayFirst(array, 0, 6);

        int[] realResult = array;
        if (CompareArrays(realResult, expectedResult)) {
            System.out.println("Change first instance of the number in the array test = OK");
        } else {
            System.out.println("Change first instance of the number in the array test = FAIL");

        }
    }

    void ChangeOneNumberInArrayFirstNone(int[] originalArray) {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest test = new ArrayServiceTest();

        int[] expectedResult = originalArray;

        int[] array = new int[originalArray.length];
        test.CopyArray(originalArray, array);

        arrayService.ChangeOneNumberInArrayFirst(array, 8, 6);
        int[] realResult = array;

        if (CompareArrays(realResult, expectedResult)) {
            System.out.println("Change first instance of the number in the array test(no number) = OK");
        } else {
            System.out.println("Change first instance of the number in the array test(no number) = FAIL");

        }
    }

    void ChangeOneNumberInArrayAllInstances(int[] originalArray) {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest test = new ArrayServiceTest();

        int[] expectedResult = {6, 1, 2, 3, 3, 4, 1, 6};
        int[] array = new int[originalArray.length];
        test.CopyArray(originalArray, array);

        arrayService.ChangeOneNumberInArrayAllInstances(array, 0, 6);

        int[] realResult = array;
        if (CompareArrays(realResult, expectedResult)) {
            System.out.println("Change all instances of the number in the array test = OK");
        } else {
            System.out.println("Change all instances of the number in the array test = FAIL");

        }
    }

    void ChangeOneNumberInArrayAllInstancesNone(int[] originalArray) {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest test = new ArrayServiceTest();

        int[] expectedResult = originalArray;
        int[] array = new int[originalArray.length];
        test.CopyArray(originalArray, array);

        arrayService.ChangeOneNumberInArrayAllInstances(array, 8, 6);

        int[] realResult = array;

        if (CompareArrays(realResult, expectedResult)) {
            System.out.println("Change all instances of the number in the array test(no number) = OK");
        } else {
            System.out.println("Change all instances of the number in the array test(no number) = FAIL");

        }
    }

    void ReverseArray(int[] originalArray) {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest test = new ArrayServiceTest();

        int[] expectedResult = {0, 1, 4, 3, 3, 2, 1, 0};
        int[] array = new int[originalArray.length];
        test.CopyArray(originalArray, array);

        arrayService.ReverseArray(array);
        int[] realResult = array;

        if (CompareArrays(realResult, expectedResult)) {
            System.out.println("Reverse array test = OK");
        } else {
            System.out.println("Reverse array test = FAIL");

        }
    }

    void SortArray(int[] originalArray) {
        ArrayService arrayService = new ArrayService();
        ArrayServiceTest test = new ArrayServiceTest();

        int[] expectedResult = {0, 0, 1, 1, 2, 3, 3, 4};
        int[] array = new int[originalArray.length];
        test.CopyArray(originalArray, array);

        arrayService.SortArray(array);
        int[] realResult = array;
        if (CompareArrays(realResult, expectedResult)) {
            System.out.println("Sort array test = OK");
        } else {
            System.out.println("Sort array test = FAIL");

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

    void CopyArray(int[] originalArray, int[] copiedArray) {
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
    }
}
