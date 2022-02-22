package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number...");
        int a = scanner.nextInt();
        System.out.println("Enter second number...");
        int b = scanner.nextInt();

        if (a < b){
            System.out.println("This number is greater: " + b);
        }
        else if (a > b) {
            System.out.println("This number is greater: " + a);
        }
    }
}
