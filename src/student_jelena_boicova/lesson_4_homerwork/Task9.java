package student_jelena_boicova.lesson_4_homerwork;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if (a < b && b < c && a < c) {
            System.out.println("increasing");

        } else if (a > b && b > c && a > c){
            System.out.println("decreasing");

        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}

