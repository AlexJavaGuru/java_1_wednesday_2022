package student_aleksandrs_jakovenko.lesson_8.level_4;

class SquareTest {

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        Square square = new Square("Square", 3.5);
        double expectedResult = 12.25;
        double actualResult = square.calculateArea();
        checkResult(expectedResult, actualResult, "Calculate area test");
    }

    public void calculatePerimeterTest() {
        Square square = new Square("Square", 3.5);
        double expectedResult = 14;
        double actualResult = square.calculatePerimeter();
        checkResult(expectedResult, actualResult, "Calculate perimeter test");
    }

    void checkResult(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
