package student_arturs_melnikovs.lesson_02.level_3;

import java.util.Scanner;

public class TaskEleven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter 3rd number: ");
        int thirdNum = scanner.nextInt();
        double average = ((double) firstNum + secondNum + thirdNum) / 3;

        System.out.println("Average is: " + average);

    }
}
