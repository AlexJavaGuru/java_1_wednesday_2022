package student_nadezda_travkina.lesson2;

import java.util.Scanner;

public class lesson2_level1_task2 {
    public class ScannerExample {

        public static void main(String[] args) {
            System.out.print ("Введите первое дробное число: ");
            Scanner scanner = new Scanner(System.in);
            double firstDoubleNumber = scanner.nextDouble();
            System.out.print ("Введите второе дробное число: ");
            double secondDoubleNumber = scanner.nextDouble();
            double sum = firstDoubleNumber + secondDoubleNumber;
            System.out.println (sum);
            double minus = firstDoubleNumber - secondDoubleNumber;
            System.out.println (minus);
            double multiply = firstDoubleNumber * secondDoubleNumber;
            System.out.println (multiply);
            double divide = firstDoubleNumber / secondDoubleNumber;
            System.out.println (divide);
    }
}
