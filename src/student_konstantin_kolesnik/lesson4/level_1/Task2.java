package student_konstantin_kolesnik.lesson4.level_1;

import java.util.Scanner;

class Task2 {

    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner whatNumberIs = new Scanner(System.in);
        int number = whatNumberIs.nextInt();

        if (number > 0) {
            System.out.println("Number " + number + " > 0" );
        } else if (number < 0) {
            System.out.println("Number " + number + " < 0" );
        } else {
            System.out.println("Number " + number + " = 0");
        }
    }
}
