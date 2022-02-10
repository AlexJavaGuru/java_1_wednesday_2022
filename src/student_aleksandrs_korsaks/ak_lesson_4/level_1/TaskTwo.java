package student_aleksandrs_korsaks.ak_lesson_4.level_1;

import java.util.Scanner;

class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input integer");
        int inputNumber = scanner.nextInt();

        if (inputNumber == 0) {
            System.out.println("You`ve entered 0");
        } else if (inputNumber > 0) {
            System.out.println("You`ve entered positive integer");
        } else {
            System.out.println("You`ve entered negative");
        }
    }
}

