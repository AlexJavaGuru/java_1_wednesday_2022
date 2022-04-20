package student_igors.lessons_4;

import java.util.Scanner;

public class LevelThreeTaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int number3 = scanner.nextInt();

        if ((number1 == number2) && (number1 == number3) && (number2 == number3)) {
            System.out.println("All numbers are equal");
        } else if ((number1 != number2) && (number1 != number3) && (number2 != number3)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}

//     Write a Java program that accepts three numbers and prints:
//     -"All numbers are equal" if all three numbers are equal,
//     - "All numbers are different" if all three numbers are different
//     - "Neither all are equal or different" otherwise.