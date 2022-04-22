package student_andrejs_saldavs.lesson_06.level_5;

public class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        isWinForHorizontalsTestOne();
        isWinForHorizontalsTestTwo();
        isWinForHorizontalsTestThree();

    }

    public static void isWinForHorizontalsTestOne() {
        TicTacToe detector = new TicTacToe();
        int[][] testField = {
                {1, -1, 0},
                {1, 1, 1},
                {0, 1, 0}
        };

        boolean result = detector.isWinPositionForHorizontals(testField, 1);
        if (result) {
            System.out.println("Test has passed!");
        } else {
            System.out.println("Test has failed!");

        }
    }

    public static void isWinForHorizontalsTestTwo() {
        TicTacToe detector = new TicTacToe();
        int[][] testField = {
                {1, 1, 1},
                {1, 0, 1},
                {0, 1, 0}
        };

        boolean result = detector.isWinPositionForHorizontals(testField, 1);
        if (result) {
            System.out.println("Test has passed!");
        } else {
            System.out.println("Test has failed!");

        }
    }

    public static void isWinForHorizontalsTestThree() {
        TicTacToe detector = new TicTacToe();
        int[][] testField = {
                {1, -1, 0},
                {0, 1, 1},
                {1, 1, 1}
        };

        boolean result = detector.isWinPositionForHorizontals(testField, 1);
        if (result) {
            System.out.println("Test has passed!");
        } else {
            System.out.println("Test has failed!");

        }
    }

}
