package student_aleksandr_zuk.lesson_8.level_4;

class TriangleTest {

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
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
        Triangle triangle = new Triangle("Triangle", 3.5);
        double expectedResult = 8.75;
        double actualResult = triangle.calculateArea();
        checkResult(expectedResult, actualResult, "Triangle area test");
    }

    public void calculatePerimeterTest() {
        Triangle triangle = new Triangle("Triangle", 3.5);
        double expectedResult = 10.5;
        double actualResult = triangle.calculateArea();
        checkResult(expectedResult, actualResult, "Triangle area test");
    }
}
