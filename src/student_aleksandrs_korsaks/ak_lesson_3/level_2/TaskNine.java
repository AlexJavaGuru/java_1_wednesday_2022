package student_aleksandrs_korsaks.ak_lesson_3.level_2;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = myScanner.nextLine();
        myScanner.close();

        System.out.println("Hello " + userName + "!");
    }
}
