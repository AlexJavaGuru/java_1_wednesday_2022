package student_jelena_boicova.lesson_6_homework;

import java.util.Scanner;

public class NumberUtilsTest {

    public static void main(String[] args) {
    int number;
        System.out.println("Enter a whole number:");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if ( number % 2 == 0 )
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
    }
}