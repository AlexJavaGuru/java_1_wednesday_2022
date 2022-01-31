package student_nikita_visnakov.nv_lesson2;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner aveScanner = new Scanner(System.in);
        System.out.println("Give me you three favorite numbers");
        System.out.println("First number:");
        double numA = aveScanner.nextDouble();
        System.out.println("Second number:");
        double numB = aveScanner.nextDouble();
        System.out.println("Third number:");
        double numC = aveScanner.nextDouble();
        double result = (numA + numB + numC) / 3;
        System.out.println("Result = " +result );



    }
}
