/*
Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.

Test Data:
Input a number: 8

Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

package student_jekaterina_soldatova.lesson02;

import java.util.Scanner;

public class internTask09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer number");
        int number = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
