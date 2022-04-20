package student_aleksandrs_korsaks.ak_lesson_4.level_2;

import java.util.Scanner;

class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 1st integer");
        int inputNumberOne = scanner.nextInt();
        System.out.println("Please input 2nd integer");
        int inputNumberTwo = scanner.nextInt();

        if (inputNumberOne < inputNumberTwo) {
            System.out.println("The smaller number is " + inputNumberOne);
        } else {
            System.out.println("The smaller number is " + inputNumberTwo);
        }
    }
}
