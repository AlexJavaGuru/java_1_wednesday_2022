package student_ilja_jantikovs.lesson_2;

import java.util.Scanner;

public class ThreeNumberAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double one = scanner.nextInt();
        System.out.println("Enter second number:");
        double two = scanner.nextInt();
        System.out.println("Enter third number:");
        double three = scanner.nextInt();
        System.out.println("Average = "+ (one + two + three)/3);
    }
}
