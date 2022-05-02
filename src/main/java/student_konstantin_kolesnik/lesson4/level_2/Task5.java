package student_konstantin_kolesnik.lesson4.level_2;

import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {

        System.out.println("Enter the first number:");
        Scanner numberOne = new Scanner(System.in);
        int firstNumber = numberOne.nextInt();

        System.out.println("Enter the second number:");
        Scanner numberTwo = new Scanner(System.in);
        int secondNumber = numberTwo.nextInt();

        if(firstNumber > secondNumber) {
            System.out.println(firstNumber + " is bigger than " + secondNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " is bigger than " + firstNumber);
        }
    }
}
