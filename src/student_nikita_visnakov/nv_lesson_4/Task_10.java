package student_nikita_visnakov.nv_lesson_4;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Value for A...");
        int numA = userInput.nextInt();
        System.out.println("Value for B");
        int numB = userInput.nextInt();
        System.out.println("Value for C...");
        int numC = userInput.nextInt();

        if ( numA > numB && numA > numC) {
            System.out.println("Better is " +numA);
        } else if (numB > numA && numB > numC) {
            System.out.println("Better is " +numB);
        } else if (numC > numA && numC > numB) {
            System.out.println("Better is " +numC);
        } else if (numA >= numB && numB >= numC) {
            System.out.println("Mistake");
        }
    }
}
