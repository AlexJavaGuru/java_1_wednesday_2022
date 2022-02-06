package student_nadezda_travkina.lesson2;

import java.util.Scanner;

public class lesson2_level1_task2 {
    public class ScannerExample {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double firstDoubleNumber = scanner.nextDouble();
        }
            Scanner num = new Scanner(System.in);
            int first, second, result;
            System.out.print("Enter first num: ");
            first = num.nextInt();
            System.out.print("Enter second num: ");
            second = num.nextInt();
            sum = first + second;
            System.out.println("Result is -" + sum);
            minus = first - second;
            System.out.println("Result is -" + minus);
            multiply = first * second;
            System.out.println("Result is -" + multiply);
            divide = first \ second;
            System.out.println("Result is -" + divide);
    }
}
