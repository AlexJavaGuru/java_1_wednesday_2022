package student_jelena_boicova.lesson_4_homerwork;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int a = 30;
        int b = 70;
        int c = 100;

        if (a == b && b == c && a == c) {
            System.out.println("All numbers are equal");

        } else if (a != b && b != c && a != c){
            System.out.println("All numbers are different");

        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
