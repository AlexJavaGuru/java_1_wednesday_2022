/*
        Написать консольную программу, которая запрашивает
        имя пользователя и выводит на консоль текст:
        Hello имя пользователя!
 */

package student_jekaterina_soldatova.lesson02.level_2_intern;

import java.util.Scanner;

public class InternTask08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NameCheck test = new NameCheck();

        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        while (test.CheckChars(name)) {
            System.out.println("Is you father Elon Musk? No? Enter a human name then");
            name = scanner.nextLine();
        }
        System.out.println("Hello, "+ name + "!");
    }
}
