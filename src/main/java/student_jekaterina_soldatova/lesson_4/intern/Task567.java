package student_jekaterina_soldatova.lesson_4.intern;

import java.util.Scanner;

class Task567 {
    public static void main(String[] args) {
        System.out.println("Please enter two integers");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                System.out.println("Numbers are different; " + firstNumber + " is bigger, " + secondNumber + " is smaller");
            } else {
                System.out.println("Numbers are different; " + secondNumber + " is bigger, " + firstNumber + " is smaller");
            }
        } else {
            System.out.println("Numbers are equals");
        }
    }
}
