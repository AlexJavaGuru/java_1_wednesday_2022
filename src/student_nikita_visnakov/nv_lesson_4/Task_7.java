package student_nikita_visnakov.nv_lesson_4;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Value for A...");
        int numA = userInput.nextInt();
        System.out.println("Value for B..");
        int numB = userInput.nextInt();

        if ( numA == numB) {
            System.out.println("Numbers are equals!");
        } else if ( numA != numB)  {  // знаю что можно не писать , просто чтоб руку набить)))
            System.out.println("Numbers are different!");
        }
    }
}
