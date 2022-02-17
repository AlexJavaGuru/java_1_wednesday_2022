package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number..");
        int number = scanner.nextInt();

        if (number == 0){
            System.out.println("Your number " + number + " is zero");
            }
        if (number < 0){
            System.out.println("Your number " + number + " is negative");
        }
        if (number > 0){
            System.out.println("Your number " + number + " is even");
        }

    }
}
