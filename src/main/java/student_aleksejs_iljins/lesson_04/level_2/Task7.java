package student_aleksejs_iljins.lesson_04.level_2;

import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("\"Numbers are equals\"");
        } else {
        //} else if (firstNumber != secondNumber) {
            System.out.println("\"Numbers are different\"");
        }
    }
}
