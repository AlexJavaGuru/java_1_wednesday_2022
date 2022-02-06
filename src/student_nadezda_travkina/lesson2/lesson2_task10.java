package student_nadezda_travkina.lesson2;

import java.util.Scanner;

public class lesson2_task10 {
    public static void main(String[] args) {
        System.out.print ("Введите радиус кругадробное число: ");
        Scanner scanner = new Scanner(System.in);
        double Radius = scanner.nextDouble();
        final double PI = 3.14;
        double perimeter = 2 * PI * Radius;
        System.out.println (perimeter);
        double square = PI * Radius *Radius;
        System.out.println (square);
    }
}

