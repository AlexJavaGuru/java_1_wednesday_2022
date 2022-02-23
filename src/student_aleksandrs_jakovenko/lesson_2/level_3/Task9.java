package student_aleksandrs_jakovenko.lesson_2.level_3;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = scanner.nextInt();
        System.out.println("Multiplication table:");
        for (int i = 1; i < 11; i++){
            int multi = number * i;
            System.out.println(number + " x " + i + " = " + multi);
        }
    }
}
