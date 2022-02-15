package student_jelena_boicova.lesson_4_homerwork;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a <= b && b < c) {
            System.out.println(c);

        } else if (a > b && a > c){
            System.out.println(a);

        } else if (a > b && b >= c){
            System.out.println(a);

        } else if (a <= c && c < b){
            System.out.println(b);

        } else if (a < c && b < a){
            System.out.println(b);

        } else if (a < b && c < b){
            System.out.println(b);

        } else if (a > c && b < c){
            System.out.println(a);
    }
    }
}
