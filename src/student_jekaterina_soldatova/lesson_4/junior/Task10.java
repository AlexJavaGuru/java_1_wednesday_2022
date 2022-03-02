package student_jekaterina_soldatova.lesson_4.junior;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        System.out.println("Please enter three integers");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else {
            if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
                System.out.println("Biggest number is " + firstNumber);
            } else if (thirdNumber >= secondNumber) {
                System.out.println("Biggest number is " + thirdNumber);
            } else {
                System.out.println("Biggest number is " + secondNumber);
            }
        }
    }
}
