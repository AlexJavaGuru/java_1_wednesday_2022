package student_daniel_demisins.hw_Lesson2.lvl1;

import java.util.Scanner;

public class Task2 {public static void main(String[] args) {

    Scanner plusScanner = new Scanner(System.in);
    System.out.println("Value for A");
    double plusA = plusScanner.nextDouble();

    System.out.println("Value for B");
    double plusB = plusScanner.nextDouble();
    double plusresult = plusA + plusB;

    System.out.println("Value for result");
    System.out.println(plusresult);




    Scanner minusScanner = new Scanner(System.in);
    System.out.println("Value for A");
    double minusA = minusScanner.nextDouble();

    System.out.println("Value for B");
    double minusB = minusScanner.nextDouble();
    double minusresult = minusA - minusB;

    System.out.println("Value for result");
    System.out.println(minusresult);




    Scanner delenieScanner = new Scanner(System.in);
    System.out.println("Value for A");
    double delenieA = delenieScanner.nextDouble();

    System.out.println("Value for B");
    double delenieB = delenieScanner.nextDouble();
    double delenieresult = delenieA / delenieB;

    System.out.println("Value for result");
    System.out.println(delenieresult);



    Scanner umnoScanner = new Scanner(System.in);
    System.out.println("Value for A");
    double umnoA = umnoScanner.nextDouble();

    System.out.println("Value for B");
    double umnoB = umnoScanner.nextDouble();
    double umnoresult = umnoA * umnoB;

    System.out.println("Value for result");
    System.out.println(umnoresult);
}
}
