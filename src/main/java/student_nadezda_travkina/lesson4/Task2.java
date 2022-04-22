package student_nadezda_travkina.lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number from 1 to 7 ");
        int x = scanner.nextInt();

        if (x == 1) {
            System.out.println("Monday");
        } else if (x == 2) {
            System.out.println("Tuesday");
        } else if (x == 3) {
            System.out.println("Wednesday");
        } else if (x == 4) {
            System.out.println("Thursday");
        } else if (x == 5) {
            System.out.println("Friday");
        } else if (x == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
    }
}
