/*
Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
 */

package student_jekaterina_soldatova.lesson_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();
        if (numberToCheck > 0) {
            System.out.print("The number is positive");
        } else if (numberToCheck == 0) {
            System.out.println("The number is 0");
        } else {
            System.out.println("The number is negative");
        }
    }
}
