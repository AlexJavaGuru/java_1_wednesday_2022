package student_igors.lessons_4;

import java.util.Scanner;

public class LevelTwoTaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter your second number");
        int number2 = scanner.nextInt();

         if (number1 == number2) {
             System.out.println("Numbers are equals");
         } else {
             System.out.println("Numbers are different");
         }
    }
}

//   Написать программу, которая запрашивает у пользователя
//   два целых числа и выводит на консоль:
//   - "Numbers are equals" - если числа равны
//   - "Numbers are different" - если числа не равны