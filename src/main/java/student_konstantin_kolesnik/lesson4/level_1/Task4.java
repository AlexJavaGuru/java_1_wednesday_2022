package student_konstantin_kolesnik.lesson4.level_1;

import java.util.Scanner;

class Task4 {

    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner whatNumberIs = new Scanner(System.in);
        int number = whatNumberIs.nextInt();

        if(number % 2 == 0) {
            System.out.println("Number " + number + " is even");
        } else {
            System.out.println("Number " + number + " is not even");
        }
    }
}
