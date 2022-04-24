package student_andrejs_saldavs.lesson_08.level_4;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.calculateAreaTest();
        shapeUtilTest.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomRectangle();
        shapes[2] = shapeUtil.createRandomSquare();
        shapes[3] = shapeUtil.createRandomTriangle();
        double actualResult = shapeUtil.calculateArea(shapes);
        double expectedResult = shapes[0].calculateArea() + shapes[1].calculateArea() + shapes[2].calculateArea() + shapes[3].calculateArea();
        checkResult(expectedResult, actualResult, "Combined area test");
    }

    public void calculatePerimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomTriangle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomCircle();
        double expectedResult = shapes[0].calculatePerimeter() + shapes[1].calculatePerimeter() + shapes[2].calculatePerimeter() + shapes[3].calculatePerimeter();
        double actualResult = shapeUtil.calculatePerimeter(shapes);
        checkResult(expectedResult, actualResult, "Combined perimeter test");
    }

    void checkResult(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedResult + " but actual is " + actualResult);
        }
    }

}
