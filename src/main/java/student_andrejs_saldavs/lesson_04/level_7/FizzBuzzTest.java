package student_andrejs_saldavs.lesson_04.level_7;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }

    public void fizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(15).equals("FizzBuzz"), "Test FizzBuzz");
    }

    public void fizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(3).equals("Fizz"), "Test Fizz");
    }

    public void buzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(5).equals("Buzz"), "Test Buzz");
    }

    public void notFizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(4).equals("4"), "Test NotFizzBuzz");
    }

    private void checkResults(boolean state, String testName) {
        if (state) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }

}
