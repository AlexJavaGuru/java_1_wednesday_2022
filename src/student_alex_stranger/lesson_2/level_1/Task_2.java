package student_alex_stranger.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number");
        double secondNumber = scanner.nextDouble();

        double sumResult = firstNumber + secondNumber;
        double subResult = firstNumber - secondNumber;
        double multResult = firstNumber * secondNumber;
        double divResult = firstNumber / secondNumber;

        System.out.println(firstNumber + "+" + secondNumber + "=" + sumResult);
        System.out.println(firstNumber + "-" + secondNumber + "=" + subResult);
        System.out.println(firstNumber + "*" + secondNumber + "=" + multResult);
        System.out.println (firstNumber + "/" + secondNumber + "=" + divResult);




    }




}

