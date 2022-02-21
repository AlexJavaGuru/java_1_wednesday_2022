package student_aleksejs_iljins.lesson_05.level_2;

import java.util.Random;

public class Task15 {

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3};

        Random random = new Random();
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();

        System.out.println("Первое случайное число: " + numbers[0]);
        System.out.println("Второе случайное число: " + numbers[1]);
        System.out.println("Третье случайное число: " + numbers[2]);

        int sumOne = numbers[0] + 2;
        int sumTwo = numbers[1] + 2;
        int sumThree = numbers[2] + 2;

        System.out.println("Первое случайное число увеличенное на два: " + sumOne);
        System.out.println("Второе случайное число увеличенное на два: " + sumTwo);
        System.out.println("Третье случайное число увеличенное на два: " + sumThree);

    }
}
