package student_aleksandrs_jakovenko.Lesson2.Level3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();

        double perimeter, area;
        perimeter = (2 * radius) * Math.PI;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
