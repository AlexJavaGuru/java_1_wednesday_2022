/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте среднее значение и выведите его на консоль.
 */
package student_jekaterina_soldatova.lesson_5.intern;

class Task14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int result = 0;
        for (int i = 0; i < 3; i++) {
            numbers[i] = (int)(Math.random()*10);
            System.out.println(numbers[i]);
            result += numbers[i];
        }
        System.out.println((double)result/numbers.length);

    }
}
