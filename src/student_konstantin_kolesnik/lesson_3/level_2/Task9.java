package student_konstantin_kolesnik.lesson_3.level_2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        System.out.println("Please, enter your name:");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
