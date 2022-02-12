package student_nadezda_travkina.lesson2.level3;

import java.util.Scanner;

public class ArithmeticExpressionsFourth {
    public static void main(String[] args) {
        System.out.print ("Введите радиус круга дробное число: ");
        Scanner scanner = new Scanner(System.in);
        double Radius = scanner.nextDouble();
        final double PI = 3.14F;
        double Perimeter = 2 * PI * Radius;
        System.out.println ("Perimeter is = " + Perimeter);
        double Square = PI * Radius * Radius;
        System.out.println ("Area is = " + Square);
    }
}

