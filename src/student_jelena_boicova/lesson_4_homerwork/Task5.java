package student_jelena_boicova.lesson_4_homerwork;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int a = 50;
        int b = 100;

        if (a < b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
