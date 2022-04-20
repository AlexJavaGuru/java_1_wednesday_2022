package student_arturs_melnikovs.lesson_04.level_07;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();

        test.testBuzz();
        test.testFizz();
        test.testFizzBuzz();
        test.testElse();
    }

    void testFizz() {
        FizzBuzz test = new FizzBuzz();
        int number = 3;
        String expectedResult = "Fizz";
        String actualResult = test.detect(number);
        checkResult(expectedResult, actualResult, "Fizz test");
    }
    void testBuzz() {
        FizzBuzz test = new FizzBuzz();
        int number = 5;
        String expectedResult = "Buzz";
        String actualResult = test.detect(number);
        checkResult(expectedResult, actualResult, "Buzz test");
    }
    void testFizzBuzz() {
        FizzBuzz test = new FizzBuzz();
        int number = 15;
        String expectedResult = "FizzBuzz";
        String actualResult = test.detect(number);
        checkResult(expectedResult, actualResult, "FizzBuzz test");
    }
    void testElse() {
        FizzBuzz test = new FizzBuzz();
        int number = 4;
        String expectedResult = "4";
        String actualResult = test.detect(number);
        checkResult(expectedResult, actualResult, "Else test");
    }

    void checkResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected result was " + expectedResult + ", actual result is " + actualResult);
        }
    }
}
