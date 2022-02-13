package student_aleksandrs_korsaks.ak_lesson_4.level_4;

import java.util.Scanner;

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator newCalc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 1st number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please input 2st number");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + newCalc.sum(firstNumber, secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + newCalc.sub(firstNumber, secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + newCalc.mul(firstNumber, secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + newCalc.div(firstNumber, secondNumber));

        System.out.println();
        System.out.println("Please input number to check is it Even or Odd");
        int thirdNumber = scanner.nextInt();
        System.out.println("Is number " + thirdNumber + " - Even number? It`s " + newCalc.isEven(thirdNumber));

    }
}
