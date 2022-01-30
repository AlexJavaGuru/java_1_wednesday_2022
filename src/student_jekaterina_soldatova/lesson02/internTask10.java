/*
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

//S = π × r2
//L = 2*r*π
//Math.PI*
package student_jekaterina_soldatova.lesson02;

import java.util.Scanner;

public class internTask10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;

        System.out.println("Enter radius of a circle");
        double r = scanner.nextDouble();

        System.out.println("Perimeter is = " + 2 * r * pi);
        System.out.println("Area is = " + pi * (r * r));
    }
}
