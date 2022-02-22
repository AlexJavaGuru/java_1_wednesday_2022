package student_vladislav_deineka.lesson_4.level_2;

import java.util.Scanner;

public class LowestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int x = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int q = scanner.nextInt();

        if (x < q) {
            System.out.println(x);
        } else {
            System.out.println(q);
        }
    }
}
