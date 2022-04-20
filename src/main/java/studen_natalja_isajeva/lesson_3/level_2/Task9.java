package studen_natalja_isajeva.lesson_3.level_2;

import java.util.Scanner;

public class Task9 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your name:");
        String yourName = scanner.nextLine();

        String greeting = "Hello" + " " + yourName + " "+ "!";
        System.out.println(greeting);

    }
}
