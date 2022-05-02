package student_aleksandrs_jakovenko.lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.elseTest();
    }
    public void fizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(9);
        String expectedResult = "Fizz";
        if (actualResult == expectedResult) {
            System.out.println("Fizz test = OK");
        } else {
            System.out.println("Fizz test = FAIL");
        }
    }
    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(10);
        String expectedResult = "Buzz";
        if (actualResult == expectedResult) {
            System.out.println("Buzz test = OK");
        } else {
            System.out.println("Buzz test = FAIL");
        }
    }
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(15);
        String expectedResult = "FizzBuzz";
        if (actualResult == expectedResult) {
            System.out.println("FizzBuzz test = OK");
        } else {
            System.out.println("FizzBuzz test = FAIL");
        }
    }
    public void elseTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(11);
        String expectedResult = "11";
        if (expectedResult.equals(actualResult)) {
            System.out.println("Else test = OK");
        } else {
            System.out.println("Else test = FAIL");
        }
    }
}

