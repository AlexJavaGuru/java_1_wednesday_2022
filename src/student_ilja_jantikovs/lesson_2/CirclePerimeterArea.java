package student_ilja_jantikovs.lesson_2;

import java.awt.geom.Area;
import java.util.Scanner;

public class CirclePerimeterArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle radius");
        double radius = scanner.nextDouble();
        double area = Math.PI*radius*radius;
        double perimeter = 2*Math.PI*radius;
        System.out.println("Area= " +area);
        System.out.println("Perimeter= " +perimeter);
    }
}
