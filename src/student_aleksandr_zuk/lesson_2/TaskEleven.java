package student_aleksandr_zuk.lesson_2;

import java.util.Scanner;

public class TaskEleven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First variable");

        double variable1 = scanner.nextDouble();

        System.out.println("Second variable");

        double variable2 = scanner.nextDouble();

        System.out.println("Third variable");

        double variable3 = scanner.nextDouble();

        double resultSum = (variable1 + variable2 + variable3) / 3;

        System.out.println((variable1 + " + " + variable2 + " + " + variable3) + " / " + 3 + " = " + resultSum);

    }
}
