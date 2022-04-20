package student_jekaterina_soldatova.lesson06.level_5_middle;

public class TicTacToeTest {
    public static void main(String[] args) {
        testIsWinForHorizontalPlayerOne();
        testIsWinForHorizontalPlayerTwo();
        testIsNotWinForHorizontalPlayerOne();
        testIsNotWinForHorizontalPlayerTwo();

        testIsWinForVerticalsPlayerOne();
        testIsWinForVerticalsPlayerTwo();
        testIsNotWinForVerticalsPlayerOne();
        testIsNotWinForVerticalsPlayerTwo();

        testIsWinForDiagonalDownPlayerOne();
        testIsWinForDiagonalDownPlayerTwo();
        testIsNotWinForDiagonalDownPlayerOne();
        testIsNotWinForDiagonalDownPlayerTwo();

        testIsWinForDiagonalUpPlayerOne();
        testIsWinForDiagonalUpPlayerTwo();
        testIsNotWinForDiagonalUpPlayerOne();
        testIsNotWinForDiagonalUpPlayerTwo();

        testIsWinPlayerOne();
        testIsWinPlayerTwo();
        testIsNotWinPlayerOne();
        testIsNotWinPlayerTwo();

        testIsDraw();
        testIsNotDrawWin();
        testIsNotDrawEmpty();

        testCreateFieldTrue();
        testCreateFieldTFalse();
    }

    static void testIsWinForHorizontalPlayerOne() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 2},
                             { 1, 1, 1},
                             { 2, 0, 2}};
        boolean result = subject.isWinPositionForHorizontals(testField, 1);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsWinForHorizontalPlayerTwo() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 2, 2, 0},
                             { 2, 1, 2},
                             { 2, 2, 2}};
        boolean result = subject.isWinPositionForHorizontals(testField, 2);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNotWinForHorizontalPlayerOne() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 0, 0},
                             { 2, 1, 2}};
        boolean result = subject.isWinPositionForHorizontals(testField, 1);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNotWinForHorizontalPlayerTwo() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 0, 0},
                             { 2, 0, 0}};
        boolean result = subject.isWinPositionForHorizontals(testField, 2);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }


    static void testIsWinForVerticalsPlayerOne() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 1, 1},
                             { 1, 2, 1}};
        boolean result = subject.isWinPositionForVerticals(testField, 1);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsWinForVerticalsPlayerTwo() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0, 2, 0},
                             { 1, 2, 2},
                             { 2, 2, 0}};
        boolean result = subject.isWinPositionForVerticals(testField, 2);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNotWinForVerticalsPlayerOne() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 0, 0},
                             { 2, 1, 2}};
        boolean result = subject.isWinPositionForVerticals(testField, 1);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNotWinForVerticalsPlayerTwo() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 1, 0},
                             { 2, 0, 2}};
        boolean result = subject.isWinPositionForVerticals(testField, 2);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }


    static void testIsWinForDiagonalDownPlayerOne() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 1, 2},
                             { 2, 2, 1}};
        boolean result = subject.isWinPositionForDiagonalsDown(testField, 1);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsWinForDiagonalDownPlayerTwo() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 2, 1, 2},
                             { 1, 2, 1},
                             { 0, 2, 2}};
        boolean result = subject.isWinPositionForDiagonalsDown(testField, 2);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNotWinForDiagonalDownPlayerOne() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 0, 0},
                             { 2, 1, 2}};
        boolean result = subject.isWinPositionForDiagonalsDown(testField, 1);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNotWinForDiagonalDownPlayerTwo() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 1, 0},
                             { 2, 0, 2}};
        boolean result = subject.isWinPositionForDiagonalsUp(testField, 2);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }



    static void testIsWinForDiagonalUpPlayerOne() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 1, 2},
                             { 1, 2, 2}};
        boolean result = subject.isWinPositionForDiagonalsUp(testField, 1);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsWinForDiagonalUpPlayerTwo() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 2, 1, 2},
                             { 1, 2, 1},
                             { 2, 1, 2}};
        boolean result = subject.isWinPositionForDiagonalsUp(testField, 2);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNotWinForDiagonalUpPlayerOne() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 0, 0},
                             { 2, 1, 2}};
        boolean result = subject.isWinPositionForDiagonalsUp(testField, 1);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNotWinForDiagonalUpPlayerTwo() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 1, 0},
                             { 2, 0, 2}};
        boolean result = subject.isWinPositionForDiagonalsUp(testField, 2);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }


    static void testIsWinPlayerOne() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 1, 2},
                             { 1, 2, 2}};
        boolean result = subject.isWinPosition(testField, 1);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsWinPlayerTwo() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 2, 1, 2},
                             { 1, 1, 1},
                             { 2, 2, 2}};
        boolean result = subject.isWinPosition(testField, 2);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNotWinPlayerOne() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 0, 0},
                             { 2, 1, 2}};
        boolean result = subject.isWinPosition(testField, 1);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNotWinPlayerTwo() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, 0, 1},
                             { 2, 1, 0},
                             { 2, 0, 2}};
        boolean result = subject.isWinPosition(testField, 2);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }


    static void testIsDraw() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 2, 1, 2},
                             { 1, 2, 1},
                             { 2, 1, 1}};
        boolean result = subject.isDrawPosition(testField);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNotDrawWin() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 2, 0, 1},
                             { 2, 0, 0},
                             { 2, 1, 2}};
        boolean result = subject.isWinPosition(testField, 1);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testIsNotDrawEmpty() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 2, 0, 1},
                             { 1, 0, 0},
                             { 2, 1, 2}};
        boolean result = subject.isDrawPosition(testField);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }


    static void testCreateFieldTrue() {
        TicTacToeTest test = new TicTacToeTest();
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0, 0, 0},
                             { 0, 0, 0},
                             { 0, 0, 0}};
        boolean result = test.compareArrays(subject.createField(), (testField));
        if (result) {
            System.out.println("create Passed");
        } else {
            System.out.println("Failed");
        }
    }

    static void testCreateFieldTFalse() {
        TicTacToeTest test = new TicTacToeTest();
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0, 0, 0},
                             { 0, 0, 0},
                             { 0, 0, 1}};
        boolean result = test.compareArrays(subject.createField(), (testField));
        if (!result) {
            System.out.println("create Passed");
        } else {
            System.out.println("create Failed");
        }
    }


    boolean compareArrays(int[][] real, int[][] expected) {
        for (int i = 0; i < real.length; i++) {
            for (int j = 0; j < real[0].length; j++) {
                if (real[i][j] != expected[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
