package student_daniel_demisins.hw_Lesson2.lvl3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner numOne = new Scanner(System.in);
        int numA = numOne.nextInt();
        Scanner numTwo = new Scanner(System.in);
        int numB = numTwo.nextInt();
        Scanner numThree = new Scanner(System.in);
        int numC = numThree.nextInt();

        double result = numA+numB+ numC /  3;
        System.out.println("Average is = " + result);

    }
}
