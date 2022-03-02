package student_konstantin_kolesnik.lesson4.level_3;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {

        System.out.println("Enter the first number:");
        Scanner numberOne = new Scanner(System.in);
        int firstNumber = numberOne.nextInt();

        System.out.println("Enter the second number:");
        Scanner numberTwo = new Scanner(System.in);
        int secondNumber = numberTwo.nextInt();

        System.out.println("Enter the second number:");
        Scanner numberThree = new Scanner(System.in);
        int thirdNumber = numberThree.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("First number " + firstNumber + " is the biggest number");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Second number " + secondNumber + " is the biggest number");
        } else if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
            System.out.println("Third number " + thirdNumber + " is the biggest number");
        }
    }
}
