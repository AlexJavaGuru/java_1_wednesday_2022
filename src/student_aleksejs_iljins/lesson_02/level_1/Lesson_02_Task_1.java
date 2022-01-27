package student_aleksejs_iljins.lesson_02.level_1;

import java.util.Scanner;

public class Lesson_02_Task_1 {
    public static void main(String[] args) {

        Scanner firstScanner = new Scanner(System.in);

        System.out.println("Значение первой цифры:");
        int variable1 = firstScanner.nextInt();
        System.out.println("Значение второй цифры:");
        int variable2 = firstScanner.nextInt();
        int resultSum = variable1 + variable2;
        int resultSub = variable1 - variable2;
        int resultMul = variable1 * variable2;
        int resultDiv = variable1 / variable2;

        System.out.println("Сложение:   " + variable1 + " + " + variable2 + " = " + resultSum);
        System.out.println("Вычитание:  " + variable1 + " - " + variable2 + " = " + resultSub);
        System.out.println("Умножение:  " + variable1 + " * " + variable2 + " = " + resultMul);
        System.out.println("Деление:    " + variable1 + " / " + variable2 + " = " + resultDiv);
    }
}
