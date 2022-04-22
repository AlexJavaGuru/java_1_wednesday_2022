package student_igors.lesson_6.level_7;

import java.util.Arrays;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }

    public void fizzTest() {
        FizzBuzz subject = new FizzBuzz();
        String actualResult = subject.detect(7);
        String expectedResult = "Fizz";
        checkResult(expectedResult, actualResult, "Fizz test");
    }
    public void buzzTest() {
        FizzBuzz subject = new FizzBuzz();
        String actualResult = subject.detect(9);
        String expectedResult = "Buzz";
        checkResult(expectedResult, actualResult, "Buzz test");
    }
    public void fizzBuzzTest() {
        FizzBuzz subject = new FizzBuzz();
        String actualResult = subject.detect(63);
        String expectedResult = "FizzBuzz";
        checkResult(expectedResult, actualResult, "FizzBuzz test");
    }
    public void notFizzBuzzTest() {
        FizzBuzz subject = new FizzBuzz();
        String actualResult = subject.detect(1);
        String expectedResult = "" + 2;
        checkResult(expectedResult, actualResult, "Negative test");
    }

    void checkResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " Passed");
        } else {
            System.out.println(testName + " Failed");
        }
    }
}
