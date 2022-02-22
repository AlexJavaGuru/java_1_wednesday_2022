package student_vladislav_deineka.lesson_4.level_3;

import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int x = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int q = scanner.nextInt();
        System.out.println("Enter number 3: ");
        int z = scanner.nextInt();

        if (x < q && q < z) {
            System.out.println("Increasing order");
        } else if (x > q && q > z) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
