package student_igors.Level_3;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius of circle in sm:");
        double radiusOfCircle = scanner.nextDouble();
        double area = Math.PI * (radiusOfCircle * radiusOfCircle);
        double perimeter = Math.PI * 2 * radiusOfCircle;
        System.out.println("Area of the Circle is:" + area);
        System.out.println("Perimeter of Circle is:" + perimeter);

    }
}
