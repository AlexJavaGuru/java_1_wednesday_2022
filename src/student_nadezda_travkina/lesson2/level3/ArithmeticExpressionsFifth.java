package student_nadezda_travkina.lesson2.level3;

import java.util.Scanner;

public class ArithmeticExpressionsFifth {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double secondDoubleNumber = scanner.nextDouble();
        System.out.print("Введите третье число: ");
        double thirdDoubleNumber = scanner.nextDouble();
        double arithmeticMean = (firstDoubleNumber + secondDoubleNumber + thirdDoubleNumber) / 3;
        System.out.println(arithmeticMean);
    }
}
