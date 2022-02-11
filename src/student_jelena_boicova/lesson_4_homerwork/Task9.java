package student_jelena_boicova.lesson_4_homerwork;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int a = 80;
        int b = 70;
        int c = 60;


        if (a < b && b < c && a < c) {
            System.out.println("increasing");

        } else if (a > b && b > c && a > c){
            System.out.println("decreasing");

        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}

