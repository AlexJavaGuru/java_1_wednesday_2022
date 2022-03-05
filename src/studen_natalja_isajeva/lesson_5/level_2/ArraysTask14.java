package studen_natalja_isajeva.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Random random = new Random();
        double sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            sum = sum + numbers[i];
            average = sum / numbers.length;
        }
            System.out.println(Arrays.toString(numbers));
        System.out.println("Average is: " + average);
    }
}
