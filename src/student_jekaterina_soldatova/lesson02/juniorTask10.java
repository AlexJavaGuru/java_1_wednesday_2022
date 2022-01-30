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

package student_jekaterina_soldatova.lesson02;

import java.util.Scanner;

public class juniorTask10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius of a circle");
        double r = scanner.nextDouble();

        System.out.println("Perimeter is = " + 2 * r * Math.PI);
        System.out.println("Area is = " + Math.PI * (r * r));
    }
}
