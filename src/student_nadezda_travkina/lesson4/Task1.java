package student_nadezda_travkina.lesson4;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number..");
        int x = scanner.nextInt();

        if (x < 0) {
            System.out.println("number is negative");
        } else if (x > 0) {
            System.out.println("number is positive");
        }
    }
}
