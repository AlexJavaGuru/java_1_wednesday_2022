package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number...");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number...");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter your third number...");
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber){
            System.out.println("The number are in increasing order");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber){
            System.out.println("The numbers are in decreasing order");
        } else {
            System.out.println("Neither decreasing or increasing order");
        }

    }
}
