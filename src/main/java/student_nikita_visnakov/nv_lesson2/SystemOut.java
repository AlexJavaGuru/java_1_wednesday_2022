package student_nikita_visnakov.nv_lesson2;

import java.util.Scanner;

public class SystemOut {

    public static void main(String[] args) {

        Scanner plusScanner = new Scanner(System.in);
        System.out.println("Value for plus A:");
        int plusA = plusScanner.nextInt();
        System.out.println("Value for plus B:");
        int plusB =  plusScanner.nextInt();
        int plusResult = plusA + plusB;
        System.out.println("Calculating: var A -> " +plusA +  " + " + "var B -> " +plusB + " result = " +plusResult);

        Scanner minScanner = new Scanner(System.in);
        System.out.println("Value for minA:");
        int minA = minScanner.nextInt();
        System.out.println("Value for min B:");
        int minB = minScanner.nextInt();
        int resultMin = minA - minB;
        System.out.println("Calculating: Var A -> " +minA + " - " + "Var B -> " +minB + " result = " +resultMin);

        Scanner multScanner = new Scanner(System.in);
        System.out.println("Value for mulA:");
        int multA = multScanner.nextInt();
        System.out.println("Value for multB:");
        int multB = multScanner.nextInt();
        int multResult = multA * multB;
        System.out.println("Calculating: Var A -> " +multA + " * " + " Var B -> " +multB + " result = " +multResult);

        Scanner devScanner = new Scanner(System.in);
        System.out.println("Value for devA:");
        int devA = devScanner.nextInt();
        System.out.println("Value for devB:");
        int devB = devScanner.nextInt();
        int devResult = devA / devB;
        System.out.println("Calculating: Var A -> " +devA + " / " + "Var B -> " +devB + " result = " + devResult);






    }
}
