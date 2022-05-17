package student_arturs_melnikovs.lesson_06.level_04;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {

    public static void main(String[] args) {
        TwoDimensionalArray arrayHelper = new TwoDimensionalArray();
        int[][] myArray = arrayHelper.createTwoDArray(5, 5);
        arrayHelper.fillWithRandomNumbers(myArray);
        arrayHelper.printTwoDArray(myArray);
        System.out.println("Sum of all number in arrays: " + arrayHelper.sumAllNumbersInArray(myArray));
    }

    int[][] createTwoDArray(int firstNumber, int secondNumber) {
        return new int[firstNumber][secondNumber];
    }

    void fillWithRandomNumbers(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
    }

    int sumAllNumbersInArray(int[][] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                result += arr[i][j];
            }
        }
        return result;
    }

    void printTwoDArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println(" | ");
        }
    }

}


