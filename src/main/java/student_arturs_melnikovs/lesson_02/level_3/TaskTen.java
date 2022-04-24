package student_arturs_melnikovs.lesson_02.level_3;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {

        System.out.println("Enter the radius of the circle: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double perim = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;

        System.out.println("Perimeter is: " + perim);
        System.out.println("Area is: " + area);

    }
}
