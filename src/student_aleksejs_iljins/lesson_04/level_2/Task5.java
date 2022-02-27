package student_aleksejs_iljins.lesson_04.level_2;

import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Эта цифра наибольшая: " + firstNumber);
        } else if (firstNumber < secondNumber){
            System.out.println("Эта цифра наибольшая: " + secondNumber);
        }
    }
}
