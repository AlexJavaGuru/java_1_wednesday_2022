package student_nadezda_travkina.lesson4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number ");
        int x = scanner.nextInt();
        System.out.println("Type second number ");
        int y = scanner.nextInt();
        System.out.println("Type third number ");
        int a = scanner.nextInt();

        if (x == y & y == a) {
            System.out.println("Numbers are equals");
        } else if (x != y & y != a & x != a) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
