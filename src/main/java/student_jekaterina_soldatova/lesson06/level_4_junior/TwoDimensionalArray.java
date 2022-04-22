package student_jekaterina_soldatova.lesson06.level_4_junior;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of rows and number of columns of the array");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        TwoDimensionalArray utility = new TwoDimensionalArray();
        int[][] twoDimensionalArray = new int[rows][columns];

        utility.fillArray(twoDimensionalArray);
        utility.printArray(twoDimensionalArray);
        utility.findSum(twoDimensionalArray);
    }

    int random() {
        return (int) (Math.random() * 10);
    }

    void fillArray(int[][] array) {
        TwoDimensionalArray utility = new TwoDimensionalArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = utility.random();
            }
        }
    }

    void findSum(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                sum = sum + ints[j];
            }
        }
        System.out.println("Sum of all numbers in the array is " + sum);
    }

    void printArray(int[][] array) {
        for (int[] firstRow : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(firstRow[j] + " ");
            }
            System.out.println();
        }
    }
}