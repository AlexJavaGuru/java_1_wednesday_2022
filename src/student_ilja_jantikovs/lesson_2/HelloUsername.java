package student_ilja_jantikovs.lesson_2;

import java.util.Scanner;

public class HelloUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username:");
        String username = scanner.next();
        System.out.println("Hello " + username + "!");

    }


}
