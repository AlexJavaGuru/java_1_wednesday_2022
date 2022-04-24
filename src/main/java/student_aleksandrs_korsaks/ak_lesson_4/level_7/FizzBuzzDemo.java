package student_aleksandrs_korsaks.ak_lesson_4.level_7;

import java.util.Scanner;

class FizzBuzzDemo {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        System.out.println(fizzBuzz.detect(number));
    }
}
