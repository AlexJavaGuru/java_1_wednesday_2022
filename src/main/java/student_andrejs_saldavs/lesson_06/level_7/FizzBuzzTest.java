package student_andrejs_saldavs.lesson_06.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzAndBuzzTest();
    }

    public void fizzTest() {
        FizzBuzz detector = new FizzBuzz();
        String expectedResult = "Fizz";
        String actualResult = detector.detect(6);
        checkResult(expectedResult, actualResult, "Fizz test");
    }

    public void buzzTest() {
        FizzBuzz detector = new FizzBuzz();
        String expectedResult = "Buzz";
        String actualResult = detector.detect(10);
        checkResult(expectedResult, actualResult, "Buzz test");
    }

    public void fizzAndBuzzTest() {
        FizzBuzz detector = new FizzBuzz();
        String expectedResult = "FizzBuzz";
        String actualResult = detector.detect(15);
        checkResult(expectedResult, actualResult, "Fizz and Buzz test");
    }

    void checkResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!" + "Expected result was" + expectedResult + " but actual is " + actualResult );
        }
    }
}
