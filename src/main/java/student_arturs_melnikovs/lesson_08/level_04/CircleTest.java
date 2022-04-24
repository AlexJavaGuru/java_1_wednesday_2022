package student_arturs_melnikovs.lesson_08.level_04;

class CircleTest {
    public static void main(String[] args) {
        CircleTest tester = new CircleTest();
        tester.testCalculateArea();
        tester.testCalculatePerimeter();
    }

    public void testCalculateArea() {
        Circle circle = new Circle("Circle", 5);
        double expectedResult = 78.53981633974483;
        double actualResult = circle.calculateArea();
        checkResult(expectedResult, actualResult, "Calculate area test");
    }
    public void testCalculatePerimeter() {
        Circle circle = new Circle("Circle", 5);
        double expectedResult = 31.41592653589793;
        double actualResult = circle.calculatePerimeter();
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
