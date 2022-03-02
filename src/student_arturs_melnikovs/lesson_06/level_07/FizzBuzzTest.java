package student_arturs_melnikovs.lesson_06.level_07;

import java.util.Arrays;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest tester = new FizzBuzzTest();
        tester.testDetectV1();
        tester.testDetectV2();
        tester.testDetectV3();
        tester.testDetectV4();
    }

    public void testDetectV1() {
        FizzBuzz subject = new FizzBuzz();
        String actualResult = subject.detect(3);
        String expectedResult = "Fizz";
        checkResult(expectedResult, actualResult, "Fizz test");
    }
    public void testDetectV2() {
        FizzBuzz subject = new FizzBuzz();
        String actualResult = subject.detect(5);
        String expectedResult = "Buzz";
        checkResult(expectedResult, actualResult, "Buzz test");
    }
    public void testDetectV3() {
        FizzBuzz subject = new FizzBuzz();
        String actualResult = subject.detect(15);
        String expectedResult = "FizzBuzz";
        checkResult(expectedResult, actualResult, "FizzBuzz test");
    }
    public void testDetectV4() {
        FizzBuzz subject = new FizzBuzz();
        String actualResult = subject.detect(2);
        String expectedResult = "" + 2;
        checkResult(expectedResult, actualResult, "Negative test");
    }

    void checkResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
