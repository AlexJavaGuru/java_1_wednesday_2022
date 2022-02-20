package studen_natalja_isajeva.lesson_2.level_3;

import java.util.Scanner;

public class Task9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number from 1 to 10:");
        int InputANumber = scanner.nextInt();
        System.out.println("Expected Output:");

        int mul2 = InputANumber * 2;
        int mul3 = InputANumber * 3;
        int mul4 = InputANumber * 4;
        int mul5 = InputANumber * 5;
        int mul6 = InputANumber * 6;
        int mul7 = InputANumber * 7;
        int mul8 = InputANumber * 8;
        int mul9 = InputANumber * 9;
        int mul10 = InputANumber * 10;

        System.out.println( InputANumber + " x " + " 1 " + " = " + InputANumber);
        System.out.println( InputANumber + " x " + " 2 " + " = " + mul2);
        System.out.println( InputANumber + " x " + " 3 " + " = " + mul3);
        System.out.println( InputANumber + " x " + " 4 " + " = " + mul4);
        System.out.println( InputANumber + " x " + " 5 " + " = " + mul5);
        System.out.println( InputANumber + " x " + " 6 " + " = " + mul6);
        System.out.println( InputANumber + " x " + " 7 " + " = " + mul7);
        System.out.println( InputANumber + " x " + " 8 " + " = " + mul8);
        System.out.println( InputANumber + " x " + " 9 " + " = " + mul9);
        System.out.println( InputANumber + " x " + " 10 " + " = " + mul10);
    }

}
