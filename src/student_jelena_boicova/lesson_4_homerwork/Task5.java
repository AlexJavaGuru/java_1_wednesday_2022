package student_jelena_boicova.lesson_4_homerwork;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int numberFirst = scanner.nextInt();
        int numberSecond = scanner.nextInt();

        if (numberFirst < numberSecond) {
            System.out.println(numberSecond);
        } else {
            System.out.println(numberFirst);
        }
    }
}