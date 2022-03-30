package student_igors.lessons_4;

import java.util.Scanner;

public class LevelOneTaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your number....");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("This is negative number");
        } else {
            System.out.println("This is the number => 0");
        }
    }
}
//        Написать программу, которая запрашивает у
//        пользователя
//        целое число и выводит на консоль
//        положительное оно или отрицательное.