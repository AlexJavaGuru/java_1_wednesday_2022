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
        var resultPlus = firstNumber + secondNumber;
        var resultMinus = firstNumber - secondNumber;
        var resultMult = firstNumber * secondNumber;
        var resultDiv = firstNumber / secondNumber;
        String stringOne = String.valueOf(firstNumber);
        String stringTwo = String.valueOf(secondNumber);
        System.out.println();
        System.out.println(stringOne + " + " + stringTwo + " = " + resultPlus);
        System.out.println(stringOne + " - " + stringTwo + " = " + resultMinus);
        System.out.println(stringOne + " * " + stringTwo + " = " + resultMult);
        System.out.println(stringOne + " / " + stringTwo + " = " + resultDiv);
    }
}
