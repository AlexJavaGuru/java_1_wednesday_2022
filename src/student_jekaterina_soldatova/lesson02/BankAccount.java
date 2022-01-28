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
    char letter1 = (char)(Math.random() * (90-65) + 65);
    char letter2 = (char)(Math.random() * (90-65) + 65);


    long min = 100000000000L;
    long max = 999999999999L;
    long x = (long) (Math.random() * (max-min) + min);
}
//how clean is it? can it be improved?