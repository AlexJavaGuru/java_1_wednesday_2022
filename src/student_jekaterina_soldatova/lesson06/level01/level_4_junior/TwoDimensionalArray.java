package student_jekaterina_soldatova.lesson06.level01.level_4_junior;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray utility = new TwoDimensionalArray();
        int[][] twoDimensionalArray = new int[utility.random()+2][utility.random()+2];

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