package student_nikita_visnakov.nv_lesson_4;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Choice number from one to seven....");
        int userNum = userInput.nextInt();

        if ( userNum == 1) {
            System.out.println("Monday");
        } else if ( userNum == 2) {
            System.out.println("Tuesday");
        } else if ( userNum == 3) {
            System.out.println("Wednesday");
        } else if ( userNum == 4) {
            System.out.println("Thursday");
        } else if ( userNum == 5) {
            System.out.println("Friday");
        } else if ( userNum == 6) {
            System.out.println("Saturday");
        } else if ( userNum == 7 ) {
            System.out.println("Sunday");
        } else if ( userNum > 7) {
            System.out.println("Upsss... Mistake , try again.");
        } else if ( userNum < 1 ) {
            System.out.println("Upsss... Mistake , try again...");
        }
    }
}
