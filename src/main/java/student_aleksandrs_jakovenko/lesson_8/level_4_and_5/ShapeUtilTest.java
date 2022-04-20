package student_aleksandrs_jakovenko.lesson_8.level_4_and_5;

class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.circleAreaTest();
        test.circlePerimeterTest();
    }

    public void circleAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double expectedResult = shapes[0].calculateArea() + shapes[1].calculateArea() + shapes[2].calculateArea() + shapes[3].calculateArea();
        double actualResult = shapeUtil.calculateArea(shapes);
        checkResult(expectedResult, actualResult, "Circle area test");
    }

    public void circlePerimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double expectedResult = shapes[0].calculateArea() + shapes[1].calculateArea() + shapes[2].calculateArea() + shapes[3].calculateArea();
        double actualResult = shapeUtil.calculateArea(shapes);
        checkResult(expectedResult, actualResult, "Circle perimeter test");
    }

    void checkResult(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
