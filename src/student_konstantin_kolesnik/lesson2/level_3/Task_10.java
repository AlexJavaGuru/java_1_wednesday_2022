package student_konstantin_kolesnik.lesson2.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        System.out.println("Please enter the radius of the circle:");
        Scanner scannerOne = new Scanner(System.in);
        double radius = scannerOne.nextDouble();
        double perimeterFormula = 2 * Math.PI * radius;
        double areaFormula = Math.PI * radius * radius;
        System.out.println("Expected Output:");
        System.out.println("Perimeter is = " + perimeterFormula);
        System.out.println("Area is = " + areaFormula);
    }


}
