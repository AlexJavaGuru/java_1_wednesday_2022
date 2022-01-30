/*
        Написать консольную программу, которая запрашивает у пользователя два вещественных числа
        (числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
        Вещественные числа можно запрашивать с консоли используя обьект Scanner
        следующим образом:

        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
 */

package student_jekaterina_soldatova.lesson02.level_1_intern;

import java.util.Scanner;

public class InternTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first integer number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second integer number");
        int secondNumber = scanner.nextInt();

        System.out.println("Sum of your numbers is " + (firstNumber + secondNumber) );
        System.out.println("Difference of your numbers is " + (firstNumber - secondNumber) );
        System.out.println("Product of your numbers is " + (firstNumber * secondNumber) );
        System.out.println("Quotient of your numbers is " + ((double)firstNumber / secondNumber) );
    }
}
