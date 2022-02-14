package student_konstantin_kolesnik.lesson4.level_3;

import java.util.Scanner;

public class Task8 {
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

        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("Numbers are equals");
        } else if ((firstNumber == secondNumber) || (firstNumber == thirdNumber) || (secondNumber == thirdNumber)) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("Numbers are different");
        }
    }
}


