package studen_natalja_isajeva.lesson_6.level_4;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        int sum = 0;

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(10);
                sum += numbers[i][j];
            }
        }
        System.out.println(Arrays.deepToString(numbers));
        System.out.println("Sum is " + sum);
    }

}
