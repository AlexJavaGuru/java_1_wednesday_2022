/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */
package student_jekaterina_soldatova.lesson_5.junior;

import student_jekaterina_soldatova.lesson_5.middle.ArrayUtil;

import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.println("Please enter length of the array");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please enter value for array[" + i + "]");
            numbers[i] = scanner.nextInt();
        }

        arrayUtil.printArrayToConsole(numbers);
    }
}
