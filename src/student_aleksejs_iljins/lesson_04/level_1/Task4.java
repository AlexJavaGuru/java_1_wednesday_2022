package student_aleksejs_iljins.lesson_04.level_1;

import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");

        int firstNumber = scanner.nextInt();
        //int secondNumber = 2;
        int result = firstNumber % 2;

        if (result == 0) {
            System.out.println("Ваше число чётное");
        } else {
        //if (result != 0) {
            System.out.println("Ваше число нечётное");
        }
    }
}
