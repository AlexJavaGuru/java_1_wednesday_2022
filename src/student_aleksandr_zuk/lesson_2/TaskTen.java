package student_aleksandr_zuk.lesson_2;

import java.util.Scanner;

public class TaskTen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius in cm");

        double radius = scanner.nextDouble();

        double resultPerimeter = radius * 2 * 3.14;
        double resultArea = 3.14 * (radius + radius);

        System.out.println("Perimeter: " + radius + " * " + 2 + " * " + 3.14 + " = " + resultPerimeter + " cm ");
        System.out.println("Area: " + 3.14 + " * " + radius + " * " + radius + " = " + resultArea + " cm ");



    }
}
