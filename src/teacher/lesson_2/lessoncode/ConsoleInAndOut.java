package teacher.lesson_2.lessoncode;

import java.util.Scanner;

public class ConsoleInAndOut {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Value for A:");
        int variableA = myScanner.nextInt();
        System.out.println("Value for B:");
        int variableB = myScanner.nextInt();
        double result = variableA / (double) variableB; // variableB = 4.0

//        System.out.print("Calculating: var A = ");
//        System.out.print(variableA);
//        System.out.print(" / var B = ");
//        System.out.print(variableB);
//        System.out.println();

        System.out.println("Calculating: \"var A\" = " + variableA + " / \"var B\" = " + variableB + " Result = " + result);

    }
}
