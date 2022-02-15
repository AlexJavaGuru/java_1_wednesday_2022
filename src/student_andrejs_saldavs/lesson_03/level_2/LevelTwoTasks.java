package student_andrejs_saldavs.lesson_03.level_2;

import java.util.Arrays;
import java.util.Scanner;

public class LevelTwoTasks {
    public static void main(String[] args) {
        String myName = "Andrey";
        System.out.println(myName);

        String greeting = "Hi " + myName + "!";
        System.out.println(greeting);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String typeName = scanner.nextLine();
        System.out.println("Hello " + typeName + "!");

    }
}
