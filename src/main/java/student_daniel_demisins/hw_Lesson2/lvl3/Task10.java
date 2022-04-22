package student_daniel_demisins.hw_Lesson2.lvl3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("The Number Pi = 3.141592653589793238462643");

        Scanner radScanner= new Scanner(System.in);

        double rad = radScanner.nextDouble();
        double p = 3.141592653589793238462643;
        int num = 2;

        System.out.println("Perimeter = " + num +  " * " +  p + " * " + rad + " |Result = " + (num*p*rad) );
        System.out.println("Area = " + p + " * " + rad+ " * " + rad + " | Result = " + (p*rad*rad));








    }
}

