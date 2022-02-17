package student_andrejs_saldavs.lesson_02;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter circle's radius: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;

        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
}
