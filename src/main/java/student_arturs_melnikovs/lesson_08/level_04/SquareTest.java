package student_arturs_melnikovs.lesson_08.level_04;

class SquareTest {
    public static void main(String[] args) {
        SquareTest tester = new SquareTest();
        tester.testCalculateArea();
        tester.testCalculatePerimeter();
    }

    public void testCalculateArea() {
        Square square = new Square("Square", 5);
        double expectedResult = 25;
        double actualResult = square.calculateArea();
        checkResult(expectedResult, actualResult, "Calculate area test");
    }
    public void testCalculatePerimeter() {
        Square square = new Square("Square", 5);
        double expectedResult = 20;
        double actualResult = square.calculatePerimeter();
        checkResult(expectedResult, actualResult, "Calculate perimeter test");
    }
    void checkResult(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected result: " + expectedResult +"\nActual result: " + actualResult);
        }
    }
}
