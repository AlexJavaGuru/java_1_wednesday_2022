package student_aleksejs_iljins.lesson_04.level_3;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье целое число: ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("Эта цифра наибольшая: " + a);
        } else if (b > a && b > c) {
            System.out.println("Эта цифра наибольшая: " + b);
        } else  if (c > a && c > b) {
            System.out.println("Эта цифра наибольшая: " + c);
        } else  if (a == b && b == c) {
            System.out.println("Все цифры равны.");
        }
    }
}
