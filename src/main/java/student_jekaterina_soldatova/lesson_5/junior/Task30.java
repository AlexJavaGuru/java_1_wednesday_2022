/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
 */
package student_jekaterina_soldatova.lesson_5.junior;

import student_jekaterina_soldatova.lesson_5.middle.ArrayUtil;

class Task30 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = (int) (Math.random() * 10 + 1);
        System.out.println("Array length is " + arrayLength);
        int[] numbers = new int[arrayLength];
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);

        int count = 0;
        for (int i : numbers) {
            if (i % 2 != 0) {
                count++;
                System.out.println(i + " is odd");
            }
        }
        if (count == 0) {
            System.out.println("There are no odd numbers in the array");
        }
    }
}
