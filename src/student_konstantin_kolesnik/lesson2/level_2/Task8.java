package student_konstantin_kolesnik.lesson2.level_2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        System.out.println("Enter your login: ");
        Scanner scanner = new Scanner(System.in);
        String loginView = scanner.nextLine();
        System.out.println();
        System.out.println("Hello " + loginView + "!");
    }
}
