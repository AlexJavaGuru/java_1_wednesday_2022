package student_aleksejs_iljins.lesson_02.level_3;

import java.util.Scanner;

public class Lesson_02_Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a radius cm:");

        double radius = scanner.nextDouble();

        System.out.println("Perimeter is: " + (2 * radius * 3.1415926535) + " cm");
        System.out.println("Area is: " + (radius * radius * 3.1415926535) + " cm");
    }
}
