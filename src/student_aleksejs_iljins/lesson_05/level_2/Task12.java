package student_aleksejs_iljins.lesson_05.level_2;

import java.util.Arrays;
import java.util.Random;

class Task12 {

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3};

        Random random = new Random();
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();

        System.out.println(Arrays.toString(numbers));

    }
}
