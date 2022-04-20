package student_daniel_demisins.hw_Lesson2.lvl1;

import java.util.Scanner;

public class Task1 {public static void main(String[] args) {
    Scanner plusScanner = new Scanner(System.in);
    System.out.println("Value for A");
    int plusA = plusScanner.nextInt();

    System.out.println("Value for B");
    int plusB = plusScanner.nextInt();
    int plusresult = plusA + plusB;

    System.out.println("Value for result");
    System.out.println(plusresult);



    Scanner minusScanner = new Scanner(System.in);
    System.out.println("Value for A");
    int minusA = minusScanner.nextInt();

    System.out.println("Value for B");
    int minusB = minusScanner.nextInt();
    int minusresult = minusA - minusB;

    System.out.println("Value for result");
    System.out.println(minusresult);



    Scanner delenieScanner = new Scanner(System.in);
    System.out.println("Value for A");
    int delenieA = delenieScanner.nextInt();

    System.out.println("Value for B");
    int delenieB = delenieScanner.nextInt();
    int delenieresult = delenieA / delenieB;

    System.out.println("Value for result");
    System.out.println(delenieresult);



    Scanner umnozenieScanner = new Scanner(System.in);
    System.out.println("Value for A");
    int umnozenieA = umnozenieScanner.nextInt();

    System.out.println("Value for B");
    int umnozenieB = umnozenieScanner.nextInt();
    int umnozenieresult = umnozenieA * umnozenieB;

    System.out.println("Value for result");
    System.out.println(umnozenieresult);
}
}
