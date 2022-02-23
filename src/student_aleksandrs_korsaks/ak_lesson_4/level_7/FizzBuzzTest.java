package student_aleksandrs_korsaks.ak_lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }

    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String expectedResult = "FizzBuzz";
        String realResult = fizzBuzz.detect(number);
        checkTestResult("FizzBuzzTest", expectedResult, realResult);
    }

    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;
        String expectedResult = "Fizz";
        String realResult = fizzBuzz.detect(number);
        checkTestResult("FizzTest", expectedResult, realResult);
    }

    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;
        String expectedResult = "Buzz";
        String realResult = fizzBuzz.detect(number);
        checkTestResult("BuzzTest", expectedResult, realResult);
    }

    public void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 7;
        String expectedResult = "" + number;
        String realResult = fizzBuzz.detect(number);
        checkTestResult("notFizzBuzzTest", expectedResult, realResult);
    }

    public void checkTestResult(String testName, String expectedResult, String realResult) {
        if (realResult.equals(expectedResult)) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}
