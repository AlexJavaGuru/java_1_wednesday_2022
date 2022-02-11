package student_darja_soroka.lesson_02.level_03;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {

        System.out.println("Please, enter an integer");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number + " x 1 = " + (number));
        System.out.println(number + " x 2 = " + (number*2));
        System.out.println(number + " x 3 = " + (number*3));
        System.out.println(number + " x 4 = " + (number*4));
        System.out.println(number + " x 5 = " + (number*5));
        System.out.println(number + " x 6 = " + (number*6));
        System.out.println(number + " x 7 = " + (number*7));
        System.out.println(number + " x 8 = " + (number*8));
        System.out.println(number + " x 9 = " + (number*9));
        System.out.println(number + " x 10 = " + (number*10));
    }
}
