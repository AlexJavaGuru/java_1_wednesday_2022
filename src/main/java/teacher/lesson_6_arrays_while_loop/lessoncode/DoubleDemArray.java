package teacher.lesson_6_arrays_while_loop.lessoncode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class DoubleDemArray {

    public static void main(String[] args) {

        int[] simpleArray = new int[10];

        int[][] matrix = new int[3][3];

        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println(" | ");
        }
    }
}
