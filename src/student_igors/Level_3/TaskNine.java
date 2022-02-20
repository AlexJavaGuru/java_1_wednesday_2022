package student_igors.Level_3;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        int number = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}