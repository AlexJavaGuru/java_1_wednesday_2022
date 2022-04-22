package student_jekaterina_soldatova.lesson_3.senior;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius of a circle:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        System.out.println("Area of a circle with radius " + radius + " is: " + circle.calculateArea());
    }
}
