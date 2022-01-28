/*
        Дан код, нужно исправить ошибку компиляции.
        Для сдачи работы создайте исправленный класс.

class BankAccount {

    public static void main(String[] args) {

    }

 */

//please run internTask05

package student_jekaterina_soldatova.lesson02;

public class BankAccount {
    long min = 100000000000L;
    long max = 999999999999L;
    long x = (long) (Math.random() * (max-min) + min);   //how clean is it? meh? can it be improved?
}
