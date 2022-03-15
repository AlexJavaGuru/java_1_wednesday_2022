package student_aleksandrs_jakovenko.lesson_8.level_4;

class RectangleTest {

    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 4, 2.5);
        double expectedResult = 10;
        double actualResult = rectangle.calculateArea();
        checkResult(expectedResult, actualResult, "Calculate area test");
    }

    public void calculatePerimeterTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 3.5, 2);
        double expectedResult = 11;
        double actualResult = rectangle.calculatePerimeter();
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
