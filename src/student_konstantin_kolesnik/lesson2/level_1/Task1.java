package student_konstantin_kolesnik.lesson2.level_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        Scanner scannerTwo = new Scanner(System.in);
        int secondNumber = scannerTwo.nextInt();
        int resultPlus = firstNumber + secondNumber;
        int resultMinus = firstNumber - secondNumber;
        int resultMult = firstNumber * secondNumber;
        int resultDiv = firstNumber / secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + resultPlus);
        System.out.println(firstNumber + " - " + secondNumber + " = " + resultMinus);
        System.out.println(firstNumber + " * " + secondNumber + " = " + resultMult);
        System.out.println(firstNumber + " / " + secondNumber + " = " + resultDiv);
    }
}
