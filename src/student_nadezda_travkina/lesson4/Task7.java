package student_nadezda_travkina.lesson4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number ");
        int num1 = scanner.nextInt();
        System.out.println("Type second number ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Numbers are equals");
        } else if (num1 != num2) {
            System.out.println("Numbers are different");
        }
    }
}
