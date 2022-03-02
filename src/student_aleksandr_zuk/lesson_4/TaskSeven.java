package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number...");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number...");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber){
            System.out.println("Numbers are equals");
        } else if (firstNumber != secondNumber){
            System.out.println("Numbers are different");
        }
    }
}
