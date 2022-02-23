package student_nikita_visnakov.nv_lesson_4;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Choice the number ... ");
        int userNum = userInput.nextInt();

        if ( userNum % 2 == 0) {
            System.out.println("Even");
        } else  {
            System.out.println("Not Even");
        }
    }
}
