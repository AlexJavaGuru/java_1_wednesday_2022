package student_alex_stranger.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the circle radius:");
        double radius = scanner.nextDouble();
        double perimetr = (2 * 3.14 * radius);
        double area = (3.14 * radius * radius);
        System.out.println("Expected output for perimetr is:" + perimetr);
        System.out.println("Expected output for area is:" + area);




    }

}
