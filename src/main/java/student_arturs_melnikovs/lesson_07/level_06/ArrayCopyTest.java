package student_arturs_melnikovs.lesson_07.level_06;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest tester = new ArrayCopyTest();
        tester.testCopyInRangeV1();
        tester.testCopyInRangeV2();
        tester.testCopyInRangeNegative();
    }

    public void testCopyInRangeV1() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] testArray = {-1, 0, 14, 5, -10, 3};
        int[] expectedResult = {-1, 0, 5, 3};
        int[] actualResult = arrayCopy.copyInRange(testArray,-5, 5);
        checkResult(expectedResult, actualResult, "Copy in range test 1");
    }
    public void testCopyInRangeV2() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] testArray = {-1, 0, 14, 5, -10, 3};
        int[] expectedResult = {-1, 0, 14, 5, -10, 3};
        int[] actualResult = arrayCopy.copyInRange(testArray,-15, 15);
        checkResult(expectedResult, actualResult, "Copy in range test 2");
    }
    public void testCopyInRangeNegative() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] testArray = {-1, 0, 14, 5, -10, 3};
        int[] expectedResult = {0};
        int[] actualResult = arrayCopy.copyInRange(testArray,15, 25);
        checkResult(expectedResult, actualResult, "Copy in range negative test");
    }

    void checkResult(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
