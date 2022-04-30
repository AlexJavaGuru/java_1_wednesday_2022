package student_aleksandrs_korsaks.ak_lesson_6.level_4;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {


    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        int[][] twoDimArrayDemo = twoDimensionalArray.createTwoDimArray(3, 3);
        twoDimensionalArray.randomFillTwoDimArray(twoDimArrayDemo);

        System.out.println(Arrays.deepToString(twoDimArrayDemo));

        int sumOfAllArrayElements = twoDimensionalArray.sumOfAllTwoDimArrElements(twoDimArrayDemo);
        System.out.println("Sum of all array elements is " + sumOfAllArrayElements);

    }

    public int[][] createTwoDimArray(int arrayFirstDimLength, int arraySecondDimLength) {

        return new int[arrayFirstDimLength][arraySecondDimLength];
    }

    public void randomFillTwoDimArray(int[][] twoDimArrOfNumb) {

        Random random = new Random();
        for (int i = 0; i < twoDimArrOfNumb.length; i++) {
            for (int j = 0; j < twoDimArrOfNumb[i].length; j++) {
                twoDimArrOfNumb[i][j] = random.nextInt(100);
            }
        }
    }

    public int sumOfAllTwoDimArrElements(int[][] twoDimArrOfNumb) {

        int sum = 0;
        for (int[] numbers : twoDimArrOfNumb) {
            for (int number : numbers) {
                sum += number;
            }
        }
        return sum;
    }
}


