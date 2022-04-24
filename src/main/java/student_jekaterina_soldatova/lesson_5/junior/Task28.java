/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */
package student_jekaterina_soldatova.lesson_5.junior;

import student_jekaterina_soldatova.lesson_5.middle.ArrayUtil;

class Task28 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = (int)(Math.random()*10+1);
        System.out.println("Array length is " + arrayLength);
        int[] numbers = new int[arrayLength];
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);

        System.out.println("Smallest number is " + arrayUtil.findMinNumber(numbers));
    }
}
