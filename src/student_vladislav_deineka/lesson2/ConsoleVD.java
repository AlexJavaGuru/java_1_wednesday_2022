package student_vladislav_deineka.lesson2;

import java.util.Scanner;

public class ConsoleVD {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Number 1:");
        int variableA = myScanner.nextInt();
        System.out.println("Number 2:");
        int variableB = myScanner.nextInt();
        double result = variableA * (double) variableB;

        System.out.println("Resolving: Number 1 = " + variableA + "; Number 2 = " + variableB + "; Result = "+ result);




    }
}
