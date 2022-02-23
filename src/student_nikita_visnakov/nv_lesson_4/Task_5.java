package student_nikita_visnakov.nv_lesson_4;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Value for A is ....");
        int numA = userInput.nextInt();
        System.out.println("Value for B is ...");
        int numB = userInput.nextInt();

        if ( numA > numB ) {
            System.out.println( numA + " is better.");
        } else if ( numA < numB ) {
            System.out.println( numB + " is better.");
        } else {
            System.out.println("Ups.. they are the same.");
        }
    }
}
