package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class TaskFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number ...");
        int number = scanner.nextInt();
        int result = number % 2;

        if (result == 0){
            System.out.println("Your number is even");
        } else if (result != 0){
            System.out.println("Your number is negative");
        }


    }
}
