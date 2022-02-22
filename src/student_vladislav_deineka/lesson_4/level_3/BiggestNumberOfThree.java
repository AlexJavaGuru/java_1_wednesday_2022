package student_vladislav_deineka.lesson_4.level_3;

import java.util.Scanner;

public class BiggestNumberOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int x = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int q = scanner.nextInt();
        System.out.println("Enter number 3: ");
        int z = scanner.nextInt();

        if (x > q && x > z) {
            System.out.println("The biggest number: " + x);
        } else if (q > z && q > x) {
            System.out.println("The biggest number: " + q);
        } else
            System.out.println("The biggest number: " + z);
    }
}
