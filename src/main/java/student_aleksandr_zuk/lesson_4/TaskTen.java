package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number...");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number...");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter your third number...");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("This number is biggest: " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("This number is biggest: " + secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println("This number is biggest: " + thirdNumber);
        } else if (firstNumber == secondNumber && secondNumber == thirdNumber){
            System.out.println("These numbers are equal");}


    }
}
