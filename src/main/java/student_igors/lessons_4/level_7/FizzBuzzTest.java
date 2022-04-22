package student_igors.lessons_4.level_7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }

    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(15).equals("FizzBuzz"), "Test FizzBuzz");
    }

    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(3).equals("Fizz"), "TestFizz");

    }
    public void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(4).equals("4"), "Test NotFizzBuzz");
    }


    public void buzzTest() {
        FizzBuzz buzz = new FizzBuzz();
        checkResults(buzz.detect(5).equals("Buzz"), "TestBuzz");
    }
    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = ok");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}