package student_konstantin_kolesnik.lesson4.level_7;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }

    void fizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(15).equals("FizzBuzz"), "Test FizzBuzz");
    }

    void fizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(3).equals("Fizz"), "Test Fizz");
    }

    void buzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(5).equals("Buzz"), "Test Buzz");
    }

    void notFizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(4).equals("4"), "Test NotFizzBuzz");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
