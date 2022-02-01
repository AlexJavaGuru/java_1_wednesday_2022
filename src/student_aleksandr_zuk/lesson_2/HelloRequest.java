package student_aleksandr_zuk.lesson_2;

import java.util.Scanner;

public class HelloRequest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");

        String userName = scanner.nextLine();

        System.out.println("Hello " + userName);
    }
}
