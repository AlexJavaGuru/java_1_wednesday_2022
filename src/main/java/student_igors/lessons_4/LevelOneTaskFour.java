package student_igors.lessons_4;

import java.util.Scanner;

public class LevelOneTaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        double number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Это четное число");
        } else {
            System.out.println("Это нечетное число");
        }
    }
}

//      Написать программу, которая запрашивает у пользователя
//      целое число и выводит на консоль чётное оно или нет.
//
//      Подсказка: используйте для определения чётное число или нет
//      операцию остаток от деления (%). Если остаток от деления на 2
//      равен нулю то число чётное, иначе не чётное.