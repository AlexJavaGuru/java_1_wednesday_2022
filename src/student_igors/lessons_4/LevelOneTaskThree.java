package student_igors.lessons_4;

import java.util.Scanner;

public class LevelOneTaskThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number from 1 till 7");
        int number = scanner.nextInt();


        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else  if (number == 5) {
            System.out.println("Friday");
        } else  if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Not possible");
        }
    }
}


//  Написать программу, которая запрашивает у пользователя
//   целое число от 1 до 7 и выводит на консоль соотметствующий
//  этому числу день недели.

//  Пример:
//  Ввод: 3
//  Вывод: Wednesday

//  Ввод: 5
//  Вывод: Friday