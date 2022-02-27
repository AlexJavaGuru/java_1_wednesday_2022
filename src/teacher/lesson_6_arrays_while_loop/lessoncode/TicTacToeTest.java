package teacher.lesson_6_arrays_while_loop.lessoncode;

public class TicTacToeTest {

    public static void main(String[] args) {
        testIsWinForHorizontalsv1();
        testIsWinForHorizontalsv4();
//        testRunner.testIsWinForHorizontalsv2();
//        testRunner.testIsWinForHorizontalsv3();
    }

    public static void testIsWinForHorizontalsv1() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, -1,  1},
                             { 1,  1,  1},
                             { 0, -1, -1}};
        boolean result = subject.isWinPositionForHorizontals(testField, 1);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public static void testIsWinForHorizontalsv4() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0,  0, -1},
                             { 0,  0,  0},
                             { 0, -1, -1}};
        boolean result = subject.isWinPositionForHorizontals(testField, 0);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public void testIsWinForHorizontalsv2() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1,  1,  1},
                             { 0, -1, -1},
                             { 0,  0,  0}};
        boolean result = subject.isWinPositionForHorizontals(testField, 1);
        if (result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public void testIsWinForHorizontalsv3() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, -1,  1},
                             { 0, -1, -1},
                             { 0, -1, -1}};
        boolean result = subject.isWinPositionForHorizontals(testField, 1);
        if (!result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
