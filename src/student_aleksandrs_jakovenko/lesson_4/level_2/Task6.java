package student_aleksandrs_jakovenko.lesson_4.level_2;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = scanner.nextInt();

        if (firstNum > secondNum){
            System.out.println(secondNum + " is less!");
        }
        else if (firstNum < secondNum){
            System.out.println(firstNum + " is less!");
        }
        else
            System.out.println("Numbers are equals!");
    }
}
