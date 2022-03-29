/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */
package student_jekaterina_soldatova.lesson_5.junior;

import student_jekaterina_soldatova.lesson_5.middle.ArrayUtil;

import java.util.Scanner;

class Task27 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length of the array");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
        System.out.println("Biggest number is " + arrayUtil.findMaxNumber(numbers));
    }
}
