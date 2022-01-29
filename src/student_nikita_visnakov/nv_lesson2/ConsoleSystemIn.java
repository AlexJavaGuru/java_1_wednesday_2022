package student_nikita_visnakov.nv_lesson2;

import java.util.Scanner;

public class ConsoleSystemIn {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        System.out.println("Value for A:");
        double numA = myScanner.nextDouble();
        System.out.println("Value for B:");
        double numB = myScanner.nextDouble();
        double result = numA + (double) numB;

        System.out.println("Calculating: var A = " +numA +  " + " + " var B = " +numB + "result = " + result);

        System.out.println("I will be a Java Programmer");







    }
}
