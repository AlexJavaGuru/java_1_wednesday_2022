package student_aleksandr_zuk.lesson_2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Variable");

        int variable1 = scanner.nextInt();

        System.out.println("Second Variable");

        int variable2 = scanner.nextInt();

        int resultSum = variable1 + variable2;
        int resultSub = variable1 - variable2;
        int resultMul = variable1 * variable2;
        int resultDiv = variable1 / variable2;

        System.out.println("Addition: " + variable1 + " + " + variable2 + " = " + resultSum);
        System.out.println("Subtraction: " + variable1 + " - " + variable2 + " = " + resultSub);
        System.out.println("Multiplication: " + variable1 + " * " + variable2 + " = " + resultMul);
        System.out.println("Division: " + variable1 + " / " + variable2 + " = " + resultDiv);









    }
}
