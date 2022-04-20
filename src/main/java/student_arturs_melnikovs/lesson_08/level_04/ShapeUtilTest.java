package student_arturs_melnikovs.lesson_08.level_04;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest tester = new ShapeUtilTest();
        tester.testCalculateCombinedArea();
        tester.testCalculateCombinedPerimeter();
    }

    public void testCalculateCombinedArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double expectedResult = shapes[0].calculateArea() + shapes[1].calculateArea() + shapes[2].calculateArea() + shapes[3].calculateArea();
        double actualResult = shapeUtil.calculateCombinedArea(shapes);
        checkResult(expectedResult, actualResult, "Calculate combined area test");
    }
    public void testCalculateCombinedPerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double expectedResult = shapes[0].calculatePerimeter() + shapes[1].calculatePerimeter() + shapes[2].calculatePerimeter() + shapes[3].calculatePerimeter();
        double actualResult = shapeUtil.calculateCombinedPerimeter(shapes);
        checkResult(expectedResult, actualResult, "Calculate combined perimeter test");
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
