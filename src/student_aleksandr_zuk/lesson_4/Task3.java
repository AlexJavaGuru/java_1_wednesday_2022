package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week...");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("It is Monday!");

        }  else if (number == 2) {
            System.out.println("It is Tuesday!");
        } else if (number == 3) {
            System.out.println("It is Wednesday!");
        } else if (number == 4) {
            System.out.println("It is Thursday!");
        } else if (number == 5) {
            System.out.println("It is Friday!");
        } else if (number == 6) {
            System.out.println("It is Saturday!");
        } else if (number == 7) {
            System.out.println("It is Sunday!");


        }
    }
}
