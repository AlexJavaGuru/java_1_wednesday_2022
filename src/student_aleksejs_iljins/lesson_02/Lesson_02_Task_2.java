package student_aleksejs_iljins.lesson_02;

import java.util.Scanner;

public class Lesson_02_Task_2 {
    public static void main(String[] args) {

        Scanner secondScanner = new Scanner(System.in);

        System.out.println("Значение первой цифры:");
        double variable1 = secondScanner.nextDouble();
        System.out.println("Значение второй цифры:");
        double variable2 = secondScanner.nextDouble();
        double resultSum = variable1 + variable2;
        double resultSub = variable1 - variable2;
        double resultMul = variable1 * variable2;
        double resultDiv = variable1 / variable2;

        System.out.println("Сложение:   " + variable1 + " + " +  variable2 + " = " + resultSum);
        System.out.println("Вычитание:  " + variable1 + " - " +  variable2 + " = " + resultSub);
        System.out.println("Умножение:  " + variable1 + " * " +  variable2 + " = " + resultMul);
        System.out.println("Деление:    " + variable1 + " / " +  variable2 + " = " + resultDiv);
    }
}
