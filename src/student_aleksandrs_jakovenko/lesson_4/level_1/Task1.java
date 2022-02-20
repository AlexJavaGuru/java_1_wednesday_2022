package student_aleksandrs_jakovenko.lesson_4.level_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if (number < 0){
            System.out.println("Number " + number + " is negative!");
        } else {
            System.out.println("Number " + number + " is positive!");
        }
    }
}
