package student_jekaterina_soldatova.lesson06.level_7_senior;

class FizzBuzzTest {
    public static void main(String[] args) {
        testIsThree();
        testIsFive();
        testIsBoth();
        testIsNone();
    }

    static void testIsThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int testNumber = 6;
        String result = fizzBuzz.detect(testNumber);
        if (result.equals("Fizz")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int testNumber = 20;
        String result = fizzBuzz.detect(testNumber);
        if (result.equals("Buzz")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsBoth() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int testNumber = 30;
        String result = fizzBuzz.detect(testNumber);
        if (result.equals("FizzBuzz")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNone() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int testNumber = 8;
        String result = fizzBuzz.detect(testNumber);
        if (result.equals("8")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
