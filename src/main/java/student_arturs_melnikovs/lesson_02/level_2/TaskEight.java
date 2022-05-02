package student_arturs_melnikovs.lesson_02.level_2;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {

        System.out.print("Please, enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
