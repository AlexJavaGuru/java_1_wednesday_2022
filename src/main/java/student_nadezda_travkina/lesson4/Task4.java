package student_nadezda_travkina.lesson4;

import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number..");
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("number is even");
        } else if (x % 2 != 0) {
            System.out.println("number is odd");

        }
    }
}
