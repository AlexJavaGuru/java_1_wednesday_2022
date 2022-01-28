/*
        Дан код, нужно исправить ошибку компиляции.
        Для сдачи работы создайте исправленный класс.

class BankAccount {

    public static void main(String[] args) {

    }

 */

package student_jekaterina_soldatova.lesson02;

public class internTask05 {
    public static void main(String[] args) {
        BankAccount accountGenerator = new BankAccount();
        System.out.println("Random bank account number: " + accountGenerator.letter1 + accountGenerator.letter2 + accountGenerator.number);


    }
}
