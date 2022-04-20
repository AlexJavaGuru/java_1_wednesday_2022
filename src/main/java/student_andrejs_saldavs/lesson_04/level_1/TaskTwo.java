package student_andrejs_saldavs.lesson_04.level_1;

import java.util.Scanner;

class TaskTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int: ");
        int userNumber = scanner.nextInt();

        if (userNumber > 0) {
            System.out.println("Your number is positive");
        } else if (userNumber < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is 0");
        }

    }

}
