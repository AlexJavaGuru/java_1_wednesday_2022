package student_igors.lessons_4;

import java.util.Scanner;

public class LevelThreeTaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();
        System.out.println("Enter third number:");
        int number3 = scanner.nextInt();

        if ((number1 <= number2) && (number2 < number3)) {
            System.out.println(number3 + " Наибольшее число");
        } else if ((number1 <= number3) && (number3 < number2)) {
            System.out.println(number2 + " Наибольшее число");
        } else if ((number2 <= number1) && (number1 < number3)) {
            System.out.println(number3 + " Наибольшее число");
        } else if ((number3 <= number1) && (number1 < number2)) {
            System.out.println(number2 + " Наибольшее число" );
        } else if ((number2 <= number3) && (number3 < number1)) {
            System.out.println(number1 + " Наибольшее число");
        } else if ((number3 <= number2) && (number2 < number1)) {
            System.out.println(number1 + " Наибольшее число");
        } else {
            System.out.println("Числа имеют равные значения");
        }
    }
}


//     Написать программу, которая запрашивает у пользователя
//     три целых числа и выводит на консоль наибольшее из них.

//     PS: перед решением этой задачи распишите на бумаге
//     или в коментарии все возможные варианты (комбинации).
//     Это поможет вам правильно написать программу!
//     Нельзя пользоваться классом Math.