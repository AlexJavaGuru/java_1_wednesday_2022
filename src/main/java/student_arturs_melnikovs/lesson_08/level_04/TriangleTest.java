package student_arturs_melnikovs.lesson_08.level_04;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest tester = new TriangleTest();
        tester.testCalculateArea();
        tester.testCalculatePerimeter();
    }

    public void testCalculateArea() {
        Triangle triangle = new Triangle("Triangle", 5);
        double expectedResult = 10.825317547305481;
        double actualResult = triangle.calculateArea();
        checkResult(expectedResult, actualResult, "Calculate area test");
    }
    public void testCalculatePerimeter() {
        Triangle triangle = new Triangle("Triangle", 5);
        double expectedResult = 15;
        double actualResult = triangle.calculatePerimeter();
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
