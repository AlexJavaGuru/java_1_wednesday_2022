package student_nikita_visnakov.nv_lesson_4;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Value for A...");
        int numA = userInput.nextInt();
        System.out.println("Value for B...");
        int numB = userInput.nextInt();
        System.out.println("Value for C...");
        int numC = userInput.nextInt();

        if ( numA == numB && numA == numC) {
            System.out.println("All numbers are equal");
        } else if ( numA != numB && numA != numC) {
            System.out.println("All numbers are different!");
        } else if  (numA != numB && numA == numC) {
            System.out.println("Neither all are equal or different!");
        }
    }
}
