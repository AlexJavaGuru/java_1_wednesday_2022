package student_aleksandrs_korsaks.ak_lesson_6.level_5;

import java.util.Arrays;

class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] test = {{0, 1, 1},
                        {1, 0, 0},
                        {0, 0, 1}};
        boolean checkResultHorizontal = ticTacToe.isWinPositionForHorizontals(test,1);
        System.out.println(checkResultHorizontal);

        boolean checkResultVertical = ticTacToe.isWinPositionForVerticals(test,1);
        System.out.println(checkResultVertical);

        boolean checkResultDiagonalDown = ticTacToe.isWinPositionForDiagonalDown(test,1);
        System.out.println(checkResultDiagonalDown);

        boolean checkResultDiagonalUp = ticTacToe.isWinPositionForDiagonalUp(test,1);
        System.out.println(checkResultDiagonalUp);

        boolean checkResultDiagonals = ticTacToe.isWinPositionForDiagonals(test,1);
        System.out.println(checkResultDiagonals);

        boolean checkResult = ticTacToe.isWinPosition(test,1);
        System.out.println(checkResult);

        boolean checkDraw = ticTacToe.isDrawPosition(test);
        System.out.println(checkDraw);

        int[][] testField2 = ticTacToe.createField();
        System.out.println(Arrays.deepToString(testField2));
    }
}
