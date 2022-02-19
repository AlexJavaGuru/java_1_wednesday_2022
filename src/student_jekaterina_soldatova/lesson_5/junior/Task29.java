/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
 */
package student_jekaterina_soldatova.lesson_5.junior;

class Task29 {
    public static void main(String[] args) {
        int arrayLength = (int) (Math.random() * 10 + 1);
        System.out.println("Array length is " + arrayLength);
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = (int) (Math.random() * 10);
            System.out.println(numbers[i]);
        }

        int count = 0;
        for (int i : numbers) {
            if (i % 2 == 0 && i != 0) {
                count++;
                System.out.println(i + " is even");
            }
        }
        if (count == 0) {
            System.out.println("There are no even numbers in the array");
        }
    }
}
