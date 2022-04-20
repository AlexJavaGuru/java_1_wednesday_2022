package student_darja_soroka.lesson_02.level_03;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {

        System.out.println("Please enter a radius of the circle");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double perimeter = radius * 2 * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
