package student_nikita_visnakov.nv_lesson_4;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Value for A...");
        int userNum = userInput.nextInt();

        if ( userNum < 0 ) {
            System.out.println("Your number is negative...");
        } else if ( userNum > 0) {
            System.out.println("Your number is positive....");
        } else if (userNum == 0 ) {
            System.out.println("Your number = 0");

        }
    }
}
