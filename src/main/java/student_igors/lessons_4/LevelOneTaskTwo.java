package student_igors.lessons_4;

import java.util.Scanner;

public class LevelOneTaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number......");
        int number = scanner.nextInt();

        if (number>0) {
            System.out.println("This is positive number > 0");
        } else {
            System.out.println("The number <= 0");
        }
    }
}

//    Написать программу, которая запрашивает у пользователя
//    целое число и выводит на консоль
//    положительное оно, отрицательное или равно нулю.