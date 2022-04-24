package student_aleksejs_iljins.lesson_02.level_2;

import java.util.Scanner;

public class Lesson_02_Task_8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input your name:");

        String name = in.nextLine();


        System.out.printf("Hello: %s ", name);
        in.close();

    }
}
