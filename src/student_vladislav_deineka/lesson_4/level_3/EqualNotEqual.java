package student_vladislav_deineka.lesson_4.level_3;

import java.util.Scanner;

public class EqualNotEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int x = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int q = scanner.nextInt();
        System.out.println("Enter number 3: ");
        int z = scanner.nextInt();

        if (x == z && x == q) {
            System.out.println("Numbers are equal");
        } else if (x != q && q != z && x != z) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}
