package student_arturs_melnikovs.lesson_08.level_04;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest tester = new RectangleTest();
        tester.testCalculateArea();
        tester.testCalculatePerimeter();
    }

    public void testCalculateArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 4);
        double expectedResult = 20;
        double actualResult = rectangle.calculateArea();
        checkResult(expectedResult, actualResult, "Calculate area test");
    }
    public void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 4);
        double expectedResult = 18;
        double actualResult = rectangle.calculatePerimeter();
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
