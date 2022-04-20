/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль,
 - увеличьте значение каждой ячейки на 2,
 - выведите значение каждой ячейки на консоль.
 */
package student_jekaterina_soldatova.lesson_5.intern;

class Task15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = (int)(Math.random()*10);
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < 3; i++) {
            numbers[i] += 2;
            System.out.println(numbers[i]);
        }
    }
}
