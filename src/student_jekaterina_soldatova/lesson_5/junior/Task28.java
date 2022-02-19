/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */
package student_jekaterina_soldatova.lesson_5.junior;

class Task28 {
    public static void main(String[] args) {
        int arrayLength = (int)(Math.random()*10+1);
        System.out.println("Array length is " + arrayLength);
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = (int)(Math.random()*10);
            System.out.println(numbers[i]);
        }

        int min = numbers[0];
        for (int i = 1; i < arrayLength; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Smallest number is " + min);
    }
}
