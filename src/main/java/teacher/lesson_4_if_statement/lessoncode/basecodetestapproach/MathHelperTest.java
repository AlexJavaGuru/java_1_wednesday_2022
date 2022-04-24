package teacher.lesson_4_if_statement.lessoncode.basecodetestapproach;

public class MathHelperTest {

    public static void main(String[] args) {
        MathHelperTest testRunner = new MathHelperTest();

        testRunner.testSumOfTwoNumbers();
        testRunner.testSumOfTwoNegativeNumbers();
        testRunner.testIsNumberEven();
    }

    public void testSumOfTwoNumbers() {
        MathHelper subject = new MathHelper();
        int expectedResult = 15;
        int actualResult = subject.sum(5, 10);
        checkResult(expectedResult, actualResult, "Test 1");

    }

    public void testSumOfTwoNegativeNumbers() {
        MathHelper subject = new MathHelper();
        int expectedResult = -5;
        int actualResult = subject.sum(-10, 5);
        checkResult(expectedResult, actualResult, "Test 2");
    }

    public void testIsNumberEven() {
        MathHelper subject = new MathHelper();
        boolean actualResult = subject.ifNumberIsEven(10);
        checkResult(actualResult, "Test 3");
    }

    public void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed...");
            System.out.println("Expected result was: " + expectedResult + " but actual is: " + actualResult);
        }
    }

    public void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed...");
            System.out.println("Expected result was: true but actual is: " + actualResult);
        }
    }

}
