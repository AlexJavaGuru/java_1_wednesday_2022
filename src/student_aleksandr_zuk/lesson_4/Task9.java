package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number...");
        int a = scanner.nextInt();
        System.out.println("Enter your second number...");
        int b = scanner.nextInt();
        System.out.println("Enter your third number...");
        int c = scanner.nextInt();

        if (a < b && b < c){
            System.out.println("The number are in increasing order");
        }
        else if (a > b && b > c){
            System.out.println("The numbers are in decreasing order");
        }
        else if (a != b && b != c && a != c){
            System.out.println("Neither decreasing or increasing order");
        }

    }
}
