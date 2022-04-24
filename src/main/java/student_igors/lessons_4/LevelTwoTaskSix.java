package student_igors.lessons_4;

import java.util.Scanner;

public class LevelTwoTaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number.....");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number.....");
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println(number2 + " меньшее число");
        } else {
            System.out.println(number1 + " меньшее число");
        }
    }

}



//   Написать программу, которая запрашивает у пользователя
//   два целых числа и выводит на консоль наименьшее из них.