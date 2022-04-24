/*
Написашите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.
 */
package student_jekaterina_soldatova.lesson_5.intern;

class Task13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int result = 0;
        for (int i = 0; i < 3; i++) {
            numbers[i] = (int)(Math.random()*10);
            System.out.println(numbers[i]);
            result += numbers[i];
        }
        System.out.println(result);
    }
}
