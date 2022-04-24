package student_aleksandrs_korsaks.ak_lesson_4.level_1;

import java.util.Scanner;

class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input integer");
        int inputNumber = scanner.nextInt();

        if (inputNumber > 0) {
            System.out.println("You`ve entered positive");
        } else {
            System.out.println("You`ve entered negative");
        }
    }
}
