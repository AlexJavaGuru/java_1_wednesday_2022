package student_aleksandr_zuk.lesson_6.level_4;

import java.util.Random;

class TwoDimensionalArray {

    public static void main(String[] args) {
        TwoDimensionalArray test = new TwoDimensionalArray();
        int[][] newArray = test.twoDimensionalArray(5,5);
        test.randomArrayNumbers(newArray);
        test.printArray(newArray);
        System.out.println(test.arraySum(newArray));
    }

    int[][] twoDimensionalArray (int first, int second){
        return new int[first][second];
    }

    void randomArrayNumbers(int[][] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(5);
                
            }
            
        }
    }
    void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(" | ");
            for (int j = 0; j < array[0].length; j++) {
                System.out.println(array[i][j]);
                if (j < array[i].length - 1){
                    System.out.println(" | ");
                }
            }
            System.out.println(" | ");

        }
    }
    int arraySum(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
