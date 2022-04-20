package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number...");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number...");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber){
            System.out.println("This number is greater: " + secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println("This number is greater: " + firstNumber);
        }
    }
}
