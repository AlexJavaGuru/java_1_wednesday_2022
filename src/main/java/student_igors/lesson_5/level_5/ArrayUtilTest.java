package student_igors.lesson_5.level_5;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.testCreateArray();
        test.testMaxNumber();

    }

    public void testCreateArray() {
        ArrayUtil util = new ArrayUtil();
        int expectedResult = 10;
        int[] testArray = util.createArray(expectedResult);
        int actualResult = testArray.length;
        checkResult(expectedResult, actualResult, "Create Array test");
    }

    public void testMaxNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] testArray = {33, 20, 106, 99, 564};
        int expectedResult = testArray[3];
        int actualResult = util.maxNumbers(testArray);
        checkResult(expectedResult, actualResult, "Max Number test");
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " Passed");
        } else {
            System.out.println(testName + " Failed");
        }
    }
}

