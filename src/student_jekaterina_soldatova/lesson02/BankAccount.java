/*
        Дан код, нужно исправить ошибку компиляции.
        Для сдачи работы создайте исправленный класс.

class BankAccount {

    public static void main(String[] args) {

    }

 */

//please run internTask05

//please run internTask05

package student_jekaterina_soldatova.lesson02;

public class BankAccount {

    char getLetter() {
        int a = 65;
        int z = 90;
        return ((char) (Math.random() * (z + 1 - a) + a));
    }

    String randomLetters = "" + getLetter() + getLetter();


    String generateRandomDigits() {
        StringBuilder numberGenerator = new StringBuilder();
        int minAccountLength = 8;
        int maxAccountLength = 20;
        int accountLength = (int) (Math.random() * (maxAccountLength + 1 - minAccountLength) + minAccountLength);

        for (int i = 0; i < accountLength; i++) {
            numberGenerator.append((int) (Math.random() * 10));
        }
        return numberGenerator.toString();
    }
}

//how clean is it? how can it be improved?