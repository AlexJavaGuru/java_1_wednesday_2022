package student_aleksandrs_jakovenko.lesson_4.level_3;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNum = scanner.nextInt();

        if (firstNum < secondNum && secondNum < thirdNum){
            System.out.println("Increasing!");
        } else if (firstNum > secondNum && secondNum > thirdNum){
            System.out.println("Decreasing!");
        } else
            System.out.println("Neither increasing or decreasing order!");
    }
}
