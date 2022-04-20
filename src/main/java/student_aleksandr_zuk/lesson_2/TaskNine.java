package student_aleksandr_zuk.lesson_2;

import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number");

        int number = scanner.nextInt();

        for (int a = 1; a < 11; a++)

            System.out.println(number + " * " + a + " = " + (number * a));


    }
}
