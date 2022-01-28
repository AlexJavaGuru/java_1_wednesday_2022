/*
        Написать консольную программу, которая запрашивает у пользователя два целых числа и
        выводит на консоль результаты: сложения, вычитания, умножения и деления.

        1. Создать класс с нужным именем;
        2. Создать описать main метод;
        3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        4. Запишите полученные результаты в переменные;
        5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
        (каждый результат на новой строке отдельно).
*/

package student_jekaterina_soldatova.lesson02;

import java.util.Scanner;

public class internTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first real number");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Please enter second real number");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("Sum of your numbers is " + (firstDoubleNumber + secondDoubleNumber) );
        System.out.println("Difference of your numbers is " + (firstDoubleNumber - secondDoubleNumber) );
        System.out.println("Product of your numbers is " + (firstDoubleNumber * secondDoubleNumber) );
        System.out.println("Quotient of your numbers is " + (firstDoubleNumber / secondDoubleNumber) );
    }
}
