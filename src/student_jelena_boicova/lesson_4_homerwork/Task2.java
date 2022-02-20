package student_jelena_boicova.lesson_4_homerwork;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("Entered number is positive");
        }
        else if (x < 0) {
            System.out.println("Entered number is negative");

        } else {
            System.out.println("Entered number is equal to 0");

        }

    }
}


