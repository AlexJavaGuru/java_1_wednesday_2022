package student_aleksandr_zuk.lesson_2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Variable");

        double variable1 = scanner.nextDouble();

        System.out.println("Second Variable");

        double variable2 = scanner.nextDouble();

        double resultSum = variable1 + variable2;
        double resultSub = variable1 - variable2;
        double resultMul = variable1 * variable2;
        double resultDiv = variable1 / variable2;

        System.out.println("Addition: " + variable1 + " + " + variable2 + " = " + resultSum);
        System.out.println("Subtraction: " + variable1 + " - " + variable2 + " = " + resultSub);
        System.out.println("Multiplication: " + variable1 + " * " + variable2 + " = " + resultMul);
        System.out.println("Division: " + variable1 + " / " + variable2 + " = " + resultDiv);






    }
}
