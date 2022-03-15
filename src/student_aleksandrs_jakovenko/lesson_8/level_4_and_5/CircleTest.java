package student_aleksandrs_jakovenko.lesson_8.level_4_and_5;

class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        Circle circle = new Circle("Circle", 3.5);
        double expectedResult = 38.48451000647496;
        double actualResult = circle.calculateArea();
        checkResult(expectedResult, actualResult, "Calculate area test");
    }

    public void calculatePerimeterTest() {
        Circle circle = new Circle("Circle", 3.5);
        double expectedResult = 21.991148575128552;
        double actualResult = circle.calculatePerimeter();
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
