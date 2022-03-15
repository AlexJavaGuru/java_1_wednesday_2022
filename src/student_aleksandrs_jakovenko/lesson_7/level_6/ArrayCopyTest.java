package student_aleksandrs_jakovenko.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {

    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.testCopyInRange1();
        test.testCopyInRange2();
        test.testCopyInRange3();
    }

    public void testCopyInRange1() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] testArray = {-10, 10, 3, 0, -7, 7};
        int[] expectedResult = {3, 0, -7};
        int[] actualResult = arrayCopy.copyInRange(testArray,-7, 3);
        checkResult(expectedResult, actualResult, "testCopyInRange1");
    }
    public void testCopyInRange2() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] testArray = {-10, 10, 3, 0, -7, 7};
        int[] expectedResult = {-10, 10, 3, 0, -7, 7};
        int[] actualResult = arrayCopy.copyInRange(testArray,-10, 10);
        checkResult(expectedResult, actualResult, "testCopyInRange2");
    }
    public void testCopyInRange3() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] testArray = {-10, 10, 3, 0, -7, 7};
        int[] expectedResult = {};
        int[] actualResult = arrayCopy.copyInRange(testArray,15, 25);
        checkResult(expectedResult, actualResult, "testCopyInRange3");
    }

    void checkResult(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
