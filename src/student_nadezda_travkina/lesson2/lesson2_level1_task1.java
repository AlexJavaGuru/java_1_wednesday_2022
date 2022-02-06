package student_nadezda_travkina.lesson2;

import java.util.Scanner;

public class lesson2_level1_task1 {
    public static void main(String[] args) {
        System.out.print("Введите первое целое число: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println(sum);
        int minus = firstNumber - secondNumber;
        System.out.println(minus);
        int multiply = firstNumber * secondNumber;
        System.out.println(multiply);
        int divide = firstNumber / secondNumber;
        System.out.println(divide);
    }
}
