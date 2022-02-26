package student_aleksandrs_jakovenko.lesson_6.level_7;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzTest();
        test.buzzTest();
        test.fizzBuzzTest();
        test.elseTest();
    }

    public void fizzTest () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(9);
        String expectedResult = "Fizz";
        checkResult(actualResult, expectedResult, "FizzTest");
    }

    public void buzzTest () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(20);
        String expectedResult = "Buzz";
        checkResult(actualResult, expectedResult, "BuzzTest");
    }

    public void fizzBuzzTest () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(15);
        String expectedResult = "FizzBuzz";
        checkResult(actualResult, expectedResult, "FizzBuzzTest");
    }

    public void elseTest () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(4);
        String expectedResult = "" + 4;
        checkResult(actualResult, expectedResult, "ElseTest");
    }

    public void checkResult(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
