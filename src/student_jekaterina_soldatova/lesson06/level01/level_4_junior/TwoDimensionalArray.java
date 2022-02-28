package student_jekaterina_soldatova.lesson06.level01.level_4_junior;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray fill = new TwoDimensionalArray();

        int[][] twoDimensionalArray = new int[fill.random()][fill.random()];
        int sum = 0;

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[0].length; j++) {
                twoDimensionalArray[i][j] = fill.random();
                System.out.print(twoDimensionalArray[i][j] + " ");
                sum = sum + twoDimensionalArray[i][j];
            }
            System.out.println();
        }
    }

    int random() {
        return (int) (Math.random() * 10);
    }
}