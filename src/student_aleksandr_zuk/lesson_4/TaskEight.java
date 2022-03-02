package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number....");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number...");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number...");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber){
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber !=thirdNumber && firstNumber != thirdNumber){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }


    }
}
