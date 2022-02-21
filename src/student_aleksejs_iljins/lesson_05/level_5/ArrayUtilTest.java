package student_aleksejs_iljins.lesson_05.level_5;

public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }
    public void shouldCreateArray() {

        ArrayUtil test = new ArrayUtil();

        int number = 10;
        int expectedResult = 10;
        int [] array = test.createArray(number);
        int actualResult = array.length;

        checkResult(expectedResult, actualResult, "Test 1");
    }
    public void shouldFindMaxNumber() {

        ArrayUtil test = new ArrayUtil();

        int [] array = {1, 2, 3, 4, 5, 6};
        int expectedResult = 6;
        int actualResult = test.findMaxNumber(array);

        checkResult(expectedResult, actualResult, "Test 2");
    }
    public void shouldFindMinNumber() {

        ArrayUtil test = new ArrayUtil();

        int [] array = {1, 2, 3, 4, 5, 6};
        int expectedResult = 1;
        int actualResult = test.findMinNumber(array);

        checkResult(expectedResult, actualResult, "Test 3");
    }
    public void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}
