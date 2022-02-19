package studen_natalja_isajeva.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Random random = new Random();
        numbers[0]= random.nextInt(10);
        numbers[1]= random.nextInt(10);
        numbers[2]= random.nextInt(10);

        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (int i=0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum is: " + sum);
    }
}
