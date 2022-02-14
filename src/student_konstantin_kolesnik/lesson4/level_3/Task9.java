package student_konstantin_kolesnik.lesson4.level_3;

import java.util.Scanner;

public class Task9 {
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

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("Numbers are in Increasing order");
        } else if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Numbers are in Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
