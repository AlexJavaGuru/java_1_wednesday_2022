package student_nikita_visnakov.nv_lesson_4;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Value for A...");
        int numA = userInput.nextInt();
        System.out.println("Value for B...");
        int numB = userInput.nextInt();
        System.out.println("Value for C...");
        int numC = userInput.nextInt();

        if ( numA < numB && numB < numC) {
            System.out.println("increasing");
        } else if ( numA > numB && numB > numC) {
            System.out.println("decreasing");
        } else if ( numA < numB && numB > numC) {
            System.out.println("Neither increasing or decreasing order");
        }
    }

}
