package studen_natalja_isajeva.lesson_2.level_3;

import java.util.Scanner;

public class Task10 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("test data:");
        double radius = scanner.nextDouble();
        System.out.println("Radius = " + radius);
        System.out.println("Expected Output");

        double PI = 3.1415926535;
        double perimeter = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
