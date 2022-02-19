/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */
package student_jekaterina_soldatova.lesson_5.junior;

import java.util.Scanner;

class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length of the array");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        int max = 0;

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = (int)(Math.random()*10);
            System.out.println(numbers[i]);
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Biggest number is " + max);
    }
}
