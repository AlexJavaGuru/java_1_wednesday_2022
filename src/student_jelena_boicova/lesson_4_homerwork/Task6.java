package student_jelena_boicova.lesson_4_homerwork;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        if (numberA < numberB) {
            System.out.println(numberA);
        } else {
            System.out.println(numberB);
        }
    }
}

