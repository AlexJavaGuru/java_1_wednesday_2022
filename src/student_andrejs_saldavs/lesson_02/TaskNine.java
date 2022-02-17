package student_andrejs_saldavs.lesson_02;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int firstMul = num;
        int secondMul = num * 2;
        int thirdMul = num * 3;
        int fourthMul = num * 4;
        int fifthMul = num * 5;
        int sixthMul = num * 6;
        int seventhMul = num * 7;
        int eighthMul = num * 8;
        int ninthMul = num * 9;
        int tenthMul = num * 10;

        System.out.println(num + " * 1 = " + firstMul);
        System.out.println(num + " * 2 = " + secondMul);
        System.out.println(num + " * 3 = " + thirdMul);
        System.out.println(num + " * 4 = " + fourthMul);
        System.out.println(num + " * 5 = " + fifthMul);
        System.out.println(num + " * 6 = " + sixthMul);
        System.out.println(num + " * 7 = " + seventhMul);
        System.out.println(num + " * 8 = " + eighthMul);
        System.out.println(num + " * 9 = " + ninthMul);
        System.out.println(num + " * 10 = " + tenthMul);
    }
}
