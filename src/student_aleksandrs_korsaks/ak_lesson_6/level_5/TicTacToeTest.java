package student_aleksandrs_korsaks.ak_lesson_6.level_5;

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
        ticTacToeTest.isWinPositionForDiagonalDown1();
        ticTacToeTest.isWinPositionForDiagonalDown2();
        ticTacToeTest.isWinPositionForDiagonalUp1();
        ticTacToeTest.isWinPositionForDiagonalUp2();
        ticTacToeTest.isWinPositionForDiagonals1();
        ticTacToeTest.isWinPositionForDiagonals2();
        ticTacToeTest.isWinPositionForDiagonals3();

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

    public void isWinPositionForDiagonalDown1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, 0},
                             {1, 1, 1},
                             {1, 0, 1}};
        boolean realResult = ticTacToe.isWinPositionForDiagonalDown(testField, 1);
        checkTestResult("isWinPositionForDiagonalDown1", realResult);
    }

    public void isWinPositionForDiagonalDown2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, 1},
                             {1, 1, 1},
                             {1, 0, 0}};
        boolean realResult = !ticTacToe.isWinPositionForDiagonalDown(testField, 1);
        checkTestResult("isWinPositionForDiagonalDown1", realResult);
    }

    public void isWinPositionForDiagonalUp1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, 1},
                             {1, 1, 1},
                             {1, 0, 0}};
        boolean realResult = ticTacToe.isWinPositionForDiagonalUp(testField, 1);
        checkTestResult("isWinPositionForDiagonalUp1", realResult);
    }

    public void isWinPositionForDiagonalUp2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, -1},
                             {1, 1, 1},
                             {1, 0, 1}};
        boolean realResult = !ticTacToe.isWinPositionForDiagonalUp(testField, 1);
        checkTestResult("isWinPositionForDiagonalUp2", realResult);
    }

    public void isWinPositionForDiagonals1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{1, 0, -1},
                             {1, 1, 1},
                             {-1, 0, 1}};
        boolean realResult = ticTacToe.isWinPositionForDiagonals(testField, 1);
        checkTestResult("isWinPositionForDiagonals1", realResult);
    }

    public void isWinPositionForDiagonals2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{0, 0, 1},
                             {1, 1, 1},
                             {1, 0, 1}};
        boolean realResult = ticTacToe.isWinPositionForDiagonals(testField, 1);
        checkTestResult("isWinPositionForDiagonals2", realResult);
    }

    public void isWinPositionForDiagonals3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testField = {{0, 0, 1},
                             {1, 0, 1},
                             {1, 0, 1}};
        boolean realResult = !ticTacToe.isWinPositionForDiagonals(testField, 1);
        checkTestResult("isWinPositionForDiagonals3", realResult);
    }

    public void checkTestResult(String testName, boolean result) {
        if (result) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}
