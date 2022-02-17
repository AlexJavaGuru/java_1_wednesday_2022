package student_aleksandrs_korsaks.ak_lesson_2.level_3;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius of circle in cm (decimal)");
        double radiusOfCircle = scanner.nextDouble();

        double areaOfCircle = Math.PI * Math.pow(radiusOfCircle, 2);
        double circumferenceOfCircle = Math.PI * 2 * radiusOfCircle;

        System.out.println("Circumference of the Circle is : " + Math.round(circumferenceOfCircle * 100.0) / 100.0 + " cm");
        System.out.println("Area of the Circle is : " + Math.round(areaOfCircle * 100.0) / 100.0 + " cm2");
    }
}
