package student_vladislav_deineka.lesson_3.task_2;

import java.util.Scanner;

public class NameScan {

    public static void main(String[] args) {
        Scanner userName = new Scanner(System.in);
        System.out.println("Write your name:");
        String string = userName.nextLine();
        System.out.println("Hello " + string + "!");
    }
}
