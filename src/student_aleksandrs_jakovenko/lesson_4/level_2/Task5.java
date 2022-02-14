package student_aleksandrs_jakovenko.lesson_4.level_2;

import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = scanner.nextInt();

        if (firstNum > secondNum){
            System.out.println("First number is bigger!");
        } else if (firstNum < secondNum){
            System.out.println("Second number is bigger!");
        } else
            System.out.println("The numbers are the same!");
    }
}
