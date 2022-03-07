package student_aleksandrs_korsaks.ak_lesson_6.level_5_6;

import java.util.Arrays;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.isWinPositionForHorizontalsTest1();
        ticTacToeTest.isWinPositionForHorizontalsTest2();
        ticTacToeTest.isWinPositionForHorizontalsTest3();
        ticTacToeTest.isWinPositionForHorizontalsTest4();
        ticTacToeTest.isWinPositionForVerticalTest1();
        ticTacToeTest.isWinPositionForVerticalTest2();
        ticTacToeTest.isWinPositionForVerticalTest3();
        ticTacToeTest.isWinPositionForVerticalTest4();
        ticTacToeTest.isWinPositionForDiagonalDownTest1();
        ticTacToeTest.isWinPositionForDiagonalDownTest2();
        ticTacToeTest.isWinPositionForDiagonalUpTest1();
        ticTacToeTest.isWinPositionForDiagonalUpTest2();
        ticTacToeTest.isWinPositionForDiagonalsTest1();
        ticTacToeTest.isWinPositionForDiagonalsTest2();
        ticTacToeTest.isWinPositionForDiagonalsTest3();
        ticTacToeTest.isWinPositionTest1();
        ticTacToeTest.isWinPositionTest2();
        ticTacToeTest.isWinPositionTest3();
        ticTacToeTest.isWinPositionTest4();
        ticTacToeTest.isWinPositionTest5();
        ticTacToeTest.isDrawPositionTest1();
        ticTacToeTest.isDrawPositionTest2();
        ticTacToeTest.isDrawPositionTest3();
        ticTacToeTest.isDrawPositionTest4();
        ticTacToeTest.isDrawPositionTest5();
        ticTacToeTest.isDrawPositionTest6();
        ticTacToeTest.createFieldTest();

    }

    public void isWinPositionForHorizontalsTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 1, 1},
                            {0, 0, -1},
                            {1, -1, 1}};
        boolean realResult = ticTacToe.isWinPositionForHorizontals(testField, 1);
        checkTestResult("isWinPositionForHorizontalsTest1", realResult);
    }

    public void isWinPositionForHorizontalsTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 1, 0},
                             {1, 1, 1},
                             {1, 0, 0}};
        boolean realResult = ticTacToe.isWinPositionForHorizontals(testField, 1);
        checkTestResult("isWinPositionForHorizontalsTest2", realResult);
    }

    public void isWinPositionForHorizontalsTest3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, -1, -1},
                             {0, 0, -1},
                             {1, 1, 1}};
        boolean realResult = ticTacToe.isWinPositionForHorizontals(testField, 1);
        checkTestResult("isWinPositionForHorizontalsTest3", realResult);
    }

    public void isWinPositionForHorizontalsTest4() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, -1, 1},
                             {0, 0, -1},
                             {1, -1, 1}};
        boolean realResult = !ticTacToe.isWinPositionForHorizontals(testField, 1);
        checkTestResult("isWinPositionForHorizontalsTest4", realResult);
    }

    public void isWinPositionForVerticalTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, -1, 1},
                             {1, 0, -1},
                             {1, -1, 1}};
        boolean realResult = ticTacToe.isWinPositionForVerticals(testField, 1);
        checkTestResult("isWinPositionForVerticalTest1", realResult);
    }

    public void isWinPositionForVerticalTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{0, 1, 1},
                             {1, 1, -1},
                             {1, 1, 1}};
        boolean realResult = ticTacToe.isWinPositionForVerticals(testField, 1);
        checkTestResult("isWinPositionForVerticalTest2", realResult);
    }

    public void isWinPositionForVerticalTest3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{0, 0, 1},
                             {1, 1, 1},
                             {1, 1, 1}};
        boolean realResult = ticTacToe.isWinPositionForVerticals(testField, 1);
        checkTestResult("isWinPositionForVerticalTest3", realResult);
    }

    public void isWinPositionForVerticalTest4() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{0, 0, 1},
                             {1, 1, 1},
                             {1, 1, 0}};
        boolean realResult = !ticTacToe.isWinPositionForVerticals(testField, 1);
        checkTestResult("isWinPositionForVerticalTest4", realResult);
    }

    public void isWinPositionForDiagonalDownTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, 0},
                             {1, 1, 1},
                             {1, 0, 1}};
        boolean realResult = ticTacToe.isWinPositionForDiagonalDown(testField, 1);
        checkTestResult("isWinPositionForDiagonalDownTest1", realResult);
    }

    public void isWinPositionForDiagonalDownTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, 1},
                             {1, 1, 1},
                             {1, 0, 0}};
        boolean realResult = !ticTacToe.isWinPositionForDiagonalDown(testField, 1);
        checkTestResult("isWinPositionForDiagonalDownTest2", realResult);
    }

    public void isWinPositionForDiagonalUpTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, 1},
                             {1, 1, 1},
                             {1, 0, 0}};
        boolean realResult = ticTacToe.isWinPositionForDiagonalUp(testField, 1);
        checkTestResult("isWinPositionForDiagonalUpTest1", realResult);
    }

    public void isWinPositionForDiagonalUpTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, -1},
                             {1, 1, 1},
                             {1, 0, 1}};
        boolean realResult = !ticTacToe.isWinPositionForDiagonalUp(testField, 1);
        checkTestResult("isWinPositionForDiagonalUpTest2", realResult);
    }

    public void isWinPositionForDiagonalsTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, -1},
                             {1, 1, 1},
                             {-1, 0, 1}};
        boolean realResult = ticTacToe.isWinPositionForDiagonals(testField, 1);
        checkTestResult("isWinPositionForDiagonalsTest1", realResult);
    }

    public void isWinPositionForDiagonalsTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{0, 0, 1},
                             {1, 1, 1},
                             {1, 0, 1}};
        boolean realResult = ticTacToe.isWinPositionForDiagonals(testField, 1);
        checkTestResult("isWinPositionForDiagonalsTest2", realResult);
    }

    public void isWinPositionForDiagonalsTest3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{0, 0, 1},
                             {1, 0, 1},
                             {1, 0, 1}};
        boolean realResult = !ticTacToe.isWinPositionForDiagonals(testField, 1);
        checkTestResult("isWinPositionForDiagonalsTest3", realResult);
    }

    public void isWinPositionTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{0, 0, 1},
                             {1, 0, 1},
                             {1, 0, 1}};
        boolean realResult = ticTacToe.isWinPosition(testField, 1);
        checkTestResult("isWinPositionTest1", realResult);
    }

    public void isWinPositionTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{-1, 0, -1},
                             {1, 1, 1},
                             {1, 0, -1}};
        boolean realResult = ticTacToe.isWinPosition(testField, 1);
        checkTestResult("isWinPositionTest2", realResult);
    }

    public void isWinPositionTest3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{0, 0, 1},
                             {-1, 1, -1},
                             {1, 0, 1}};
        boolean realResult = ticTacToe.isWinPosition(testField, 1);
        checkTestResult("isWinPositionTest3", realResult);
    }

    public void isWinPositionTest4() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, -1},
                             {-1, 1, -1},
                             {1, 0, 1}};
        boolean realResult = ticTacToe.isWinPosition(testField, 1);
        checkTestResult("isWinPositionTest4", realResult);
    }

    public void isWinPositionTest5() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, -1},
                             {-1, 1, -1},
                             {1, 0, -1}};
        boolean realResult = !ticTacToe.isWinPosition(testField, 1);
        checkTestResult("isWinPositionTest5", realResult);
    }

    public void isDrawPositionTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{0, 1, 1},
                             {1, 0, 0},
                             {0, 0, 1}};
        boolean realResult = ticTacToe.isDrawPosition(testField);
        checkTestResult("isDrawPositionTest1", realResult);
    }

    public void isDrawPositionTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{0, 1, -1},
                             {1, 0, 0},
                             {0, 0, 1}};
        boolean realResult = !ticTacToe.isDrawPosition(testField);
        checkTestResult("isDrawPositionTest2", realResult);
    }

    public void isDrawPositionTest3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 1, 1},
                             {1, 0, 0},
                             {0, 0, 1}};
        boolean realResult = !ticTacToe.isDrawPosition(testField);
        checkTestResult("isDrawPositionTest3", realResult);
    }

    public void isDrawPositionTest4() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, 0},
                             {1, 1, 0},
                             {0, 1, 0}};
        boolean realResult = !ticTacToe.isDrawPosition(testField);
        checkTestResult("isDrawPositionTest4", realResult);
    }

    public void isDrawPositionTest5() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, 0},
                             {1, 1, 0},
                             {0, 1, 1}};
        boolean realResult = !ticTacToe.isDrawPosition(testField);
        checkTestResult("isDrawPositionTest5", realResult);
    }

    public void isDrawPositionTest6() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, 0},
                             {1, 0, 0},
                             {0, 1, 1}};
        boolean realResult = !ticTacToe.isDrawPosition(testField);
        checkTestResult("isDrawPositionTest6", realResult);
    }

    public void createFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] expectedResult = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        int[][] realResult = ticTacToe.createField();
        checkTestResult("createFieldTest", Arrays.deepEquals(expectedResult, realResult));
    }

    public void checkTestResult(String testName, boolean result) {
        if (result) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}
