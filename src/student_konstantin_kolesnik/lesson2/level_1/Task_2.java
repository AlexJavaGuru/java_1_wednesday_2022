package student_konstantin_kolesnik.lesson2.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number:");
        Scanner scannerTwo = new Scanner(System.in);
        double secondNumber = scannerTwo.nextDouble();
        System.out.println();

        System.out.print("First number + Second number = ");
        System.out.println(firstNumber + secondNumber);
        System.out.print("First number - Second number = ");
        System.out.println(firstNumber - secondNumber);
        System.out.print("First number * Second number = ");
        System.out.println(firstNumber * secondNumber);
        System.out.print("First number / Second number = ");
        System.out.println(firstNumber / secondNumber);
    }
}
