package student_jekaterina_soldatova.lesson_4.senior;

import java.util.Objects;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.none();
        fizzBuzzTest.onlyThree();
        fizzBuzzTest.onlyFive();
        fizzBuzzTest.bothThreeAndFive();
    }

    void none() {
        int number = 7;
        String expectedResult = "7";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("not 3 nor 5 test = OK");
        } else {
            System.out.println("not 3 nor 5 = FAIL");
        }
    }

    void onlyThree() {
        int number = 9;
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("only 3 test = OK");
        } else {
            System.out.println("only 3 test = FAIL");
        }
    }

    void onlyFive() {
        int number = 20;
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("only 5 test = OK");
        } else {
            System.out.println("only 5 test = FAIL");
        }
    }

    void bothThreeAndFive() {
        int number = 30;
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("3 and 5 test = OK");
        } else {
            System.out.println("3 and five test = FAIL");
        }
    }

}