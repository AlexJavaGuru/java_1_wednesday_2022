/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива числом, запрошенным у пользователя,
 - выведите значение каждой ячейки на консоль.
 */
package student_jekaterina_soldatova.lesson_5.intern;

import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i: numbers) {
            System.out.println(i);
        }
    }
    
}
