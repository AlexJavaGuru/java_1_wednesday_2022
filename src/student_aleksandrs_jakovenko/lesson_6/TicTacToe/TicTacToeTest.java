package student_aleksandrs_jakovenko.lesson_6.TicTacToe;

import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForHorizontalsTest1();
        test.isWinPositionForHorizontalsTest2();
        test.isWinPositionForHorizontalsTest3();
        test.isWinPositionForHorizontalsTest4();
        test.isWinPositionForVerticalsTest1();
        test.isWinPositionForVerticalsTest2();
        test.isWinPositionForVerticalsTest3();
        test.isWinPositionForVerticalsTest4();
        test.isWinPositionForDiagonalsTest1();
        test.isWinPositionForDiagonalsTest2();
        test.isWinPositionForDiagonalsTest3();
        test.isWinPositionTest1();
        test.isWinPositionTest2();
        test.isWinPositionTest3();
        test.isWinPositionTest4();
        test.isDrawPositionTest1();
        test.isDrawPositionTest2();
        test.isDrawPositionTest3();
        test.isDrawPositionTest4();
    }

    public void isWinPositionForHorizontalsTest1() {
        int[][] array = {{0, 0, 0},
                         {-1, -1, -1},
                         {-1, -1, -1}};
        boolean expectedResult = true;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionForHorizontalsTest1");
    }

    public void isWinPositionForHorizontalsTest2() {
        int[][] array = {{-1, -1, -1},
                        {0, 0, 0},
                        {-1, -1, -1}};
        boolean expectedResult = true;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionForHorizontalsTest2");
    }

    public void isWinPositionForHorizontalsTest3() {
        int[][] array = {{-1, -1, -1},
                        {-1, -1, -1},
                        {0, 0, 0}};
        boolean expectedResult = true;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionForHorizontalsTest3");
    }

    public void isWinPositionForHorizontalsTest4() {
        int[][] array = {{-1, -1, -1},
                         {-1, -1, -1},
                         {-1, -1, -1}};
        boolean expectedResult = false;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionForHorizontalsTest4");
    }

    public void isWinPositionForVerticalsTest1() {
        int[][] array = {{0, -1, -1},
                         {0, -1, -1},
                         {0, -1, -1}};
        boolean expectedResult = true;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionForVerticalsTest1");
    }

    public void isWinPositionForVerticalsTest2() {
        int[][] array = {{-1, 0, -1},
                         {-1, 0, -1},
                         {-1, 0, -1}};
        boolean expectedResult = true;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionForVerticalsTest2");
    }

    public void isWinPositionForVerticalsTest3() {
        int[][] array = {{-1, -1, 0},
                         {-1, -1, 0},
                         {-1, -1, 0}};
        boolean expectedResult = true;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionForVerticalsTest3");
    }

    public void isWinPositionForVerticalsTest4() {
        int[][] array = {{-1, -1, -1},
                         {-1, -1, -1},
                         {-1, -1, -1}};
        boolean expectedResult = false;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionForVerticalsTest4");
    }

    public void isWinPositionForDiagonalsTest1() {
        int[][] array = {{0, -1, -1},
                         {-1, 0, -1},
                         {-1, -1, 0}};
        boolean expectedResult = true;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionForDiagonalsTest1");
    }

    public void isWinPositionForDiagonalsTest2() {
        int[][] array = {{-1, -1, 0},
                         {-1, 0, -1},
                         {0, -1, -1}};
        boolean expectedResult = true;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionForDiagonalsTest2");
    }

    public void isWinPositionForDiagonalsTest3() {
        int[][] array = {{-1, -1, -1},
                         {-1, -1, -1},
                         {-1, -1, -1}};
        boolean expectedResult = false;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionForDiagonalsTest3");
    }

    public void isWinPositionTest1() {
        int[][] array = {{0, 0, 0},
                         {-1, -1, -1},
                         {-1, -1, -1}};
        boolean expectedResult = true;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionTest1");
    }
    public void isWinPositionTest2() {
        int[][] array = {{-1, 0, -1},
                         {-1, 0, -1},
                         {-1, 0, -1}};
        boolean expectedResult = true;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionTest2");
    }

    public void isWinPositionTest3() {
        int[][] array = {{0, -1, -1},
                         {-1, 0, -1},
                         {-1, -1, 0}};
        boolean expectedResult = true;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionTest3");
    }

    public void isWinPositionTest4() {
        int[][] array = {{-1, -1, -1},
                         {-1, -1, -1},
                         {-1, -1, -1}};
        boolean expectedResult = false;
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(array, 0);
        checkResult(realResult, expectedResult, "isWinPositionTest4");
    }

    public void isDrawPositionTest1() {
        int[][] array = {{0, 1, 0},
                         {1, 0, 1},
                         {1, 0, 1}};
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(array);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "isDrawPositionTest1");
    }

    public void isDrawPositionTest2() {
        int[][] array = {{0, 1, 0},
                         {1, 1, 1},
                         {1, 0, 1}};
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(array);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "isDrawPositionTest2");
    }

    public void isDrawPositionTest3() {
        int[][] array = {{0, 1, 0},
                         {1, 1, 1},
                         {0, 1, 1}};
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(array);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "isDrawPositionTest3");
    }

    public void isDrawPositionTest4() {
        int[][] array = {{1, 1, 0},
                         {0, 1, 1},
                         {1, 0, 1}};
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(array);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "isDrawPositionTest4");
    }

    void checkResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
