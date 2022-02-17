package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number ...");
        int a = scanner.nextInt();
        int b = 2;
        int c = a % b;

        if (c == 0){
            System.out.println("Your number is even");
        }
        if (c != 0){
            System.out.println("Your number is negative");
        }


    }
}
