package student_igors.lesson_6.level_4;

import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray array = new TwoDimensionalArray();
        int[][] myArray = array.createTwoDArray(5, 5);
        array.fillWithRandomNumbers(myArray);
        array.printTwoDArray(myArray);
        System.out.println("Sum of all number in arrays: " + array.sumAllNumbersInArray(myArray));
    }

    int[][] createTwoDArray(int firstNumber, int secondNumber) {
        return new int[firstNumber][secondNumber];
    }

    void fillWithRandomNumbers(int[][] arr) {
        Random number = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = number.nextInt(10);
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

