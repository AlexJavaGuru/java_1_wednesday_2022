package student_nikita_visnakov.nv_lesson2;

import org.w3c.dom.xpath.XPathResult;

import java.util.Scanner;

public class CircleRadius {

    public static void main(String[] args) {

        Scanner circleScanner = new Scanner(System.in);

        System.out.println("Say me Circle radius ");
        double  userChoice = circleScanner.nextDouble();
        double Pi = 3.14;
        double pResult = 2 * userChoice * Pi;
        double aResult = Pi * (userChoice*userChoice);
        System.out.println("Perimeter = " +pResult);
        System.out.println("Area = " +aResult);






    }
}
