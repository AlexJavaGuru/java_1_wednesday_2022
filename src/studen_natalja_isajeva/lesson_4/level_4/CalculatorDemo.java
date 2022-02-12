package studen_natalja_isajeva.lesson_4.level_4;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();
        int sumresult = calculator.sum(firstNumber, secondNumber);
        System.out.println("Sum Result = " + sumresult);

        int subresult = calculator.sub(firstNumber, secondNumber);
        System.out.println("Subtraction Result = " + subresult);

        int mulresult = calculator.mul(firstNumber, secondNumber);
        System.out.println("Multiplication Result = " + mulresult);

        int divresult = calculator.div(firstNumber, secondNumber);
        System.out.println("Division Result = " + divresult);

  //Task 13
        System.out.println(calculator.isEven (10));

    }
}
