/*
Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
 */

package student_jekaterina_soldatova.lesson_4.intern;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        System.out.println("Please enter an integer");
        Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();
        if (numberToCheck > 0) {
            System.out.print("The number is positive");
        } else if (numberToCheck < 0) {
            System.out.print("The number is negative");
        }

        if (numberToCheck % 2 == 0 && numberToCheck != 0) {
            System.out.println(" and even");
        } else if (numberToCheck % 2 != 0) {
            System.out.println(" and odd");
        }

        else {
            System.out.println("The number is 0");
        }
    }
}
