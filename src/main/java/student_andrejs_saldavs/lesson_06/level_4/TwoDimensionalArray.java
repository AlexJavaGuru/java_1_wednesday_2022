package student_andrejs_saldavs.lesson_06.level_4;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] doubleArray = new int[3][3];

        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = random.nextInt(10);
                sum = sum + j;
                System.out.println("New sum is: " + sum);
            }
        }
    }
}
