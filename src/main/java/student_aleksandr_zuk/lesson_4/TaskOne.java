package student_aleksandr_zuk.lesson_4;


import java.util.Scanner;

class TaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number...");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("Your number " + number + " is even");
        } else if (number < 0) {
            System.out.println("Your number" + number + " is negative");
        }

    }
}


