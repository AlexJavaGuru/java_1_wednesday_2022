package student_aleksejs_iljins.lesson_05.level_2;

import java.util.Random;

class Task14 {

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3};

        Random random = new Random();
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();

        int average = ((numbers[0] + numbers[1] + numbers[2]) / 3);

        System.out.println("Первое случайное число: " + numbers[0]);
        System.out.println("Второе случайное число: " + numbers[1]);
        System.out.println("Третье случайное число: " + numbers[2]);

        System.out.println("Среднее арифметическое: " + average);

    }
}
