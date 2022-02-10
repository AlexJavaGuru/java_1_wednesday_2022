package student_aleksandrs_jakovenko.lesson_4.level_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Number is even!");
        }
        else System.out.println("Number is odd!");
    }
}
