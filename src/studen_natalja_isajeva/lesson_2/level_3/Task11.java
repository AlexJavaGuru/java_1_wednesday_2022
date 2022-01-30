package studen_natalja_isajeva.lesson_2.level_3;

import java.util.Scanner;

public class Task11 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Third number:");
        int thirdNumber = scanner.nextInt();

        double result = (firstNumber + secondNumber + (double)thirdNumber) / 3;
        System.out.println("Average =" + result);

    }
}
