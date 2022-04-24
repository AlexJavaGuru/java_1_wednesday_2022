package student_aleksandrs_korsaks.ak_lesson_2.level_1;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the 1st number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the 2nd number");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mult = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + sub);
        System.out.println(firstNumber + " * " + secondNumber + " = " + mult);
        System.out.println(firstNumber + " / " + secondNumber + " = " + div);
    }
}
