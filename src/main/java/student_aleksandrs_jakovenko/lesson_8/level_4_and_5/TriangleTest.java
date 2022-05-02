package student_aleksandrs_jakovenko.lesson_8.level_4_and_5;

class TriangleTest {

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        Triangle triangle = new Triangle("Triangle", 3.5);
        double expectedResult = 5.304405598179686;
        double actualResult = triangle.calculateArea();
        checkResult(expectedResult, actualResult, "Calculate area test");
    }

    public void calculatePerimeterTest() {
        Triangle triangle = new Triangle("Triangle", 3.5);
        double expectedResult = 10.5;
        double actualResult = triangle.calculatePerimeter();
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
