package student_aleksandr_zuk.lesson_4;

import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number...");
        int a = scanner.nextInt();
        System.out.println("Enter your second number...");
        int b = scanner.nextInt();

        if (a == b){
            System.out.println("Numbers are equals");
        }
        else if (a != b){
            System.out.println("Numbers are different");
        }
    }
}
