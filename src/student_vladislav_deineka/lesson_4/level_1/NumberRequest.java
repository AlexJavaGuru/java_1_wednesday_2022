package student_vladislav_deineka.lesson_4.level_1;

import java.util.Scanner;

public class NumberRequest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Value negative");
        } else if (number > 0) {
            System.out.println("Value positive");
        } else {
            System.out.println("Value is 0");
        }
    }
}