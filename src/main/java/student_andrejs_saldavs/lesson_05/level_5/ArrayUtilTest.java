package student_andrejs_saldavs.lesson_05.level_5;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil test = new ArrayUtil();
//        test.createArray(10);
        int expectedResult = 10;
        int[] actualResult = test.createArray(10);
        checkLengthResult(expectedResult, actualResult, "Array length test");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil test = new ArrayUtil();
        int [] arrayTest = new int[] {20, 50, 31, 8, 38};
        int expectedResult = 50;
        int actualResult = test.findMaxNumber(arrayTest);
        checkResult(expectedResult, actualResult, "Array max number test");
    }

    public void shouldFindMinNumber() {
        ArrayUtil test = new ArrayUtil();
        int [] arrayTest = new int[] {20, 50, 31, 8, 38};
        int expectedResult = 8;
        int actualResult = test.findMinNumber(arrayTest);
        checkResult(expectedResult, actualResult, "Array min number test");

    }

    void checkLengthResult(int expectedResult, int[] actualResult, String testName) {
        if (expectedResult == actualResult.length) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected result was " + expectedResult + ", but actual result is " + actualResult);
        }
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected result was " + expectedResult + ", but actual result is " + actualResult);
        }
    }

}
