package student_aleksandr_zuk.lesson_8.level_4;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
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
        Rectangle rectangle = new Rectangle("Rectangle", 2, 2.5);
        double expectedResult = 5;
        double actualResult = rectangle.calculateArea();
        checkResult(expectedResult, actualResult, "Rectangle area test");
    }

    public void calculatePerimeterTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 2.5);
        double expectedResult = 9;
        double actualResult = rectangle.calculateArea();
        checkResult(expectedResult, actualResult, "Rectangle area test");
    }

}