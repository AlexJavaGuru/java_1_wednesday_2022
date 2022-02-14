package student_konstantin_kolesnik.lesson4.level_1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner scannName = new Scanner(System.in);
        String yourName = scannName.nextLine();
        System.out.println("Your name is: " + yourName);
    }
}
