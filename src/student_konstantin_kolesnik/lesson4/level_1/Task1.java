package student_konstantin_kolesnik.lesson4.level_1;

import java.util.Scanner;

class Task1 {

    public static void main(String[] args) {
        System.out.println("Please enter positive or negative number:");
        Scanner scannNumber = new Scanner(System.in);
        int number = scannNumber.nextInt();

        if (number > 0) {
            System.out.println("Number " + number + " is postive number" );
        } else if (number < 0) {
            System.out.println("Number " + number + " is negative number" );
        } else {
            System.out.println("Number " + number + " is neutral number");
        }
    }
}
