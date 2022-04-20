package student_andrejs_saldavs.lesson_04.level_1;

import java.util.Scanner;

class TaskFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int userNumber = scanner.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }

}
