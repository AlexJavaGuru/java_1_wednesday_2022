package student_konstantin_kolesnik.lesson2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        //Data
        System.out.println("Please enter number one:");
        Scanner scannerOne = new Scanner(System.in);
        double numberOne = scannerOne.nextDouble();
        System.out.println("Please enter number two:");
        Scanner scannerTwo = new Scanner(System.in);
        double numberTwo = scannerTwo.nextDouble();
        System.out.println("Please enter number three:");
        Scanner scannerThree = new Scanner(System.in);
        double numberThree = scannerThree.nextDouble();
        //Object
        var result = (numberOne + numberTwo + numberThree) / 3;
        //Display
        System.out.println("Arithmetic mean = " + result);



    }

}
