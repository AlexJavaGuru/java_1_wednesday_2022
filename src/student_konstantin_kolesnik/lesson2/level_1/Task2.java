package student_konstantin_kolesnik.lesson2.level_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number:");
        Scanner scannerTwo = new Scanner(System.in);
        double secondNumber = scannerTwo.nextDouble();
        double resultPlus = firstNumber + secondNumber;
        double resultMinus = firstNumber - secondNumber;
        double resultMult = firstNumber * secondNumber;
        double resultDiv = firstNumber / secondNumber;
        System.out.println();
        System.out.println(firstNumber + " + " + secondNumber + " = " + resultPlus);
        System.out.println(firstNumber + " - " + secondNumber + " = " + resultMinus);
        System.out.println(firstNumber + " * " + secondNumber + " = " + resultMult);
        System.out.println(firstNumber + " / " + secondNumber + " = " + resultDiv);
    }
}
