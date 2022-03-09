package student_igors.level_2;

import java.util.Scanner;

public class AscNumberOne {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st decimal number");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Enter 2nd decimal number");
        double secondDoubleNumber = scanner.nextDouble();

        double result1 = firstDoubleNumber + secondDoubleNumber;
        double result2 = firstDoubleNumber - secondDoubleNumber;
        double result3 = firstDoubleNumber * secondDoubleNumber;
        double result4 = firstDoubleNumber / secondDoubleNumber;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

}
