package student_konstantin_kolesnik.lesson4.level_2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Enter the first number:");
        Scanner numberOne = new Scanner(System.in);
        int firstNumber = numberOne.nextInt();

        System.out.println("Enter the second number:");
        Scanner numberTwo = new Scanner(System.in);
        int secondNumber = numberTwo.nextInt();

        if(firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
