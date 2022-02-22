package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number...");
        int a = scanner.nextInt();
        System.out.println("Enter your second number...");
        int b = scanner.nextInt();
        System.out.println("Enter your third number...");
        int c = scanner.nextInt();

        if (a > b && a > c){
            System.out.println("This number is biggest: " + a);
        }
        else if (b > a && b > c){
            System.out.println("This number is biggest: " + b);
        }
        else if (c > a && c > b){
            System.out.println("This number is biggest: " + c);
        }
        else if (a == b && b == c){
            System.out.println("These numbers are equal");
        }


    }
}
