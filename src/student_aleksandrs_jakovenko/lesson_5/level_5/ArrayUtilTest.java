package student_aleksandrs_jakovenko.lesson_5.level_5;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void checkResult(int[] actualResult, int[] expectedResult, String testName){
        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] actualResult = arrayUtil.createArray(5);
        int[] expectedResult = new int[5];
        checkResult(actualResult, expectedResult, "Create Array Test");
    }

}