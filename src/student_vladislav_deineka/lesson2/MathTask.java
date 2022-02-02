package student_vladislav_deineka.lesson2;

import java.util.Scanner;

public class MathTask {
    public static void main(String[] args) {


        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Write your number:");
        int Number = numberScanner.nextInt();
        System.out.println("Multiplication:");
        for (int i = 1; i <= 10; i++) {
            int multi = Number * i;
            System.out.println(Number + " x " + i + " = " + multi);
        }
    }
}
