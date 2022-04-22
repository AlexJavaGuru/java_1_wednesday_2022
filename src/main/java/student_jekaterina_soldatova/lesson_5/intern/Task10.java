/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива любым целым числом,
 - выведите значение каждой ячейки на консоль.

 */
package student_jekaterina_soldatova.lesson_5.intern;

class Task10 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
    }
}
