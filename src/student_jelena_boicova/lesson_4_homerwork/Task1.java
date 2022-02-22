package student_jelena_boicova.lesson_4_homerwork;

import java.util.Scanner;

    import java.util.Scanner;

    public class Task1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Entered number is negative");
                // negative
            } else if (number > 0) {
                System.out.println("Entered number is positive");
                // positive
            } else {
                System.out.println("Your entered number is not a positive and non-negative number");
            }
        }
    }