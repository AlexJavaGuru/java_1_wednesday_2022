package student_jekaterina_soldatova.lesson_4.junior;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        System.out.println("Please enter three integers");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("Neither increasing or decreasing order");
        } else {
            if (firstNumber >= secondNumber && secondNumber >= thirdNumber) {
                System.out.println("Decreasing order");
            } else if (firstNumber <= secondNumber && secondNumber <= thirdNumber) {
                System.out.println("Increasing order");
            } else {
                System.out.println("Neither increasing or decreasing order");
            }
        }
    }
}
