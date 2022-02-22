package student_aleksejs_iljins.lesson_04.level_3;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите третье целое число: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Эта цифра наибольшая: " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Эта цифра наибольшая: " + secondNumber);
        } else  if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Эта цифра наибольшая: " + thirdNumber);
        } else  if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("Все цифры равны.");
        }
    }
}
