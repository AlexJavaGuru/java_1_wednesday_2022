package student_aleksandr_zuk.lesson_8.level_4;

class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    void checkResult(double expectedResult, double actualResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void calculateAreaTest() {
        Square square = new Square("Square", 5);
        double expectedResult = 25;
        double actualResult = square.calculateArea();
        checkResult(expectedResult, actualResult, "Square area test");

    }

    public void calculatePerimeterTest() {
        Square square = new Square("Square", 5);
        double expectedResult = 20;
        double actualResult = square.calculateArea();
        checkResult(expectedResult, actualResult, "Square perimeter test");
    }
}