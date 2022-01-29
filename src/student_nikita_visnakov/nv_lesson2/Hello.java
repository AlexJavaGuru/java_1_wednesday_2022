package student_nikita_visnakov.nv_lesson2;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        Scanner nameScanner = new Scanner(System.in);


        System.out.println(" What is you name , Master ? ");
        System.out.println(" Recommend for you is Joda ");
        String name = nameScanner.next();
        System.out.println(" Welcome back , Master , " + name + "!!");

    }
}
