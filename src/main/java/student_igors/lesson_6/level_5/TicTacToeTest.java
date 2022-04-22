package student_igors.lesson_6.level_5;
import java.util.Arrays;
public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest tester = new TicTacToeTest();
        tester.testIsWinForHorizontalsv1();
        tester.testIsWinForHorizontalsv2();
        tester.testIsWinForHorizontalsv3();
        tester.testIsWinForHorizontalsv4();
        tester.testIsWinForVerticaslsv1();
        tester.testIsWinForVerticaslsv2();
        tester.testIsWinForVerticaslsv3();
        tester.testIsWinForVerticaslsv4();
        tester.testIsWinForDiagonalsv1();
        tester.testIsWinForDiagonalsv2();
        tester.testIsWinForDiagonalsv3();
        tester.testIsWinPositionv1();
        tester.testIsWinPositionv2();
        tester.testIsWinPositionv3();
        tester.testIsWinPositionv4();
        tester.testIsDrawv1();
        tester.testIsDrawv2();
        tester.testIsDrawv3();
        tester.testIsDrawv4();
        tester.testCreateField();
    }

    public void testIsDrawv1() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1,  1,  1},
                { 1, -1,  1},
                { 0, -1, -1}};
        boolean result = subject.isDrawPosition(testField);
        checkResult(!result, "Draw test 1");
    }
    public void testIsDrawv2() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0,  0,  0},
                { 1, -1,  1},
                { 0, -1, -1}};
        boolean result = subject.isDrawPosition(testField);
        checkResult(!result, "Draw test 2");
    }
    public void testIsDrawv3() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0,  1,  0},
                { 1,  0,  1},
                { 1,  0, -1}};
        boolean result = subject.isDrawPosition(testField);
        checkResult(!result, "Draw test 3");
    }
    public void testIsDrawv4() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0,  1,  0},
                { 1,  0,  1},
                { 1,  0,  1}};
        boolean result = subject.isDrawPosition(testField);
        checkResult(result, "Draw test 4");
    }

    public void testIsWinForHorizontalsv1() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1,  1,  1},
                { 1, -1,  1},
                { 0, -1, -1}};
        boolean result = subject.isWinPositionForHorizontals(testField, 1);
        checkResult(result, "Horizontal win test 1");
    }
    public void testIsWinForHorizontalsv2() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, -1,  1},
                { 1,  1,  1},
                { 0, -1, -1}};
        boolean result = subject.isWinPositionForHorizontals(testField, 1);
        checkResult(result, "Horizontal win test 2");
    }
    public void testIsWinForHorizontalsv3() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0, -1,  1},
                { 1,  0,  1},
                { 1,  1,  1}};
        boolean result = subject.isWinPositionForHorizontals(testField, 1);
        checkResult(result, "Horizontal win test 2");
    }
    public void testIsWinForHorizontalsv4() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1, -1,  1},
                { 0,  1,  1},
                { 0, -1, -1}};
        boolean result = subject.isWinPositionForHorizontals(testField, 1);
        checkResult(!result, "Horizontal win test 4");
    }

    public void testIsWinForVerticaslsv1() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1,  0,  1},
                { 1, -1,  1},
                { 1, -1, -1}};
        boolean result = subject.isWinPositionForVerticals(testField, 1);
        checkResult(result, "Vertical win test 1");
    }
    public void testIsWinForVerticaslsv2() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0,  1,  1},
                { 1,  1,  1},
                { 1,  1, -1}};
        boolean result = subject.isWinPositionForVerticals(testField, 1);
        checkResult(result, "Vertical win test 2");
    }
    public void testIsWinForVerticaslsv3() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1,  0,  1},
                { 0, -1,  1},
                { 1, -1,  1}};
        boolean result = subject.isWinPositionForVerticals(testField, 1);
        checkResult(result, "Vertical win test 3");
    }
    public void testIsWinForVerticaslsv4() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1,  0,  1},
                { 0, -1,  1},
                { 1, -1, -1}};
        boolean result = subject.isWinPositionForVerticals(testField, 1);
        checkResult(!result, "Vertical win test 4");
    }

    public void testIsWinForDiagonalsv1() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1,  0,  0},
                { 0,  1,  0},
                { 0,  0,  1}};
        boolean result = subject.isWinPositionForDiagonals(testField, 1);
        checkResult(result, "Diagonal win test 1");
    }
    public void testIsWinForDiagonalsv2() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0,  0,  1},
                { 0,  1,  0},
                { 1,  0,  0}};
        boolean result = subject.isWinPositionForDiagonals(testField, 1);
        checkResult(result, "Diagonal win test 2");
    }
    public void testIsWinForDiagonalsv3() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0,  0,  0},
                { 0,  0,  0},
                { 0,  0,  0}};
        boolean result = subject.isWinPositionForDiagonals(testField, 1);
        checkResult(!result, "Diagonal win test 3");
    }

    public void testIsWinPositionv1() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0,  0,  0},
                { 0,  0,  0},
                { 0,  0,  0}};
        boolean result = subject.isWinPosition(testField, 1);
        checkResult(!result, "Win position test 1");
    }
    public void testIsWinPositionv2() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1,  1,  1},
                { 0,  0,  0},
                { 0,  0,  0}};
        boolean result = subject.isWinPosition(testField, 1);
        checkResult(result, "Win position test 2");
    }
    public void testIsWinPositionv3() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 1,  0,  0},
                { 1,  0,  0},
                { 1,  0,  0}};
        boolean result = subject.isWinPosition(testField, 1);
        checkResult(result, "Win position test 3");
    }
    public void testIsWinPositionv4() {
        TicTacToe subject = new TicTacToe();
        int[][] testField = {{ 0,  0,  1},
                { 0,  1,  0},
                { 1,  0,  0}};
        boolean result = subject.isWinPosition(testField, 1);
        checkResult(result, "Win position test 4");
    }

    public void testCreateField() {
        TicTacToe subject = new TicTacToe();
        int[][] expectedResult = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        int[][] actualResult = subject.createField(3, 3);
        checkResult(expectedResult, actualResult, "Create field test");
    }

    void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
    void checkResult(int[][] expectedResult, int[][] actualResult, String testName) {
        if (Arrays.deepEquals(expectedResult, actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
