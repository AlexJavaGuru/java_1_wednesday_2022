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
    // 65 = 'A', 90 = 'Z'
    char letter1 = (char)(Math.random() * (91-89) + 89);
    char letter2 = (char)(Math.random() * (91-65) + 65);


    long min = 100000000000L;
    long max = 99999999999999999L;
    long number = (long) (Math.random() * (max-min) + min);
}
//how clean is it? can it be improved?