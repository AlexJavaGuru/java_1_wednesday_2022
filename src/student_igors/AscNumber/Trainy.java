package student_igors.AscNumber;

import java.util.Scanner;

public class Trainy {


        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first decimal number");
            double firstDoubleNumber = scanner.nextDouble();
            System.out.println("Enter second decimal number");
            double secondDoubleNumber = scanner.nextDouble();


            double result1 = firstDoubleNumber / secondDoubleNumber;
            double result2 = firstDoubleNumber * secondDoubleNumber;
            double result3 = firstDoubleNumber + secondDoubleNumber;
            double result4 = firstDoubleNumber - secondDoubleNumber;

            double sum = firstDoubleNumber + secondDoubleNumber;
            double sub = firstDoubleNumber - secondDoubleNumber;
            double mult = firstDoubleNumber * secondDoubleNumber;
            double div = firstDoubleNumber / secondDoubleNumber;

            System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + Math.round(sum * 100.0) / 100.0);
            System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + Math.round(sub * 100.0) / 100.0);
            System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + Math.round(mult * 100.0) / 100.0);
            System.out.println(firstDoubleNumber + " / " + secondDoubleNumber + " = " + Math.round(div * 100.0) / 100.0);
        }

    }


