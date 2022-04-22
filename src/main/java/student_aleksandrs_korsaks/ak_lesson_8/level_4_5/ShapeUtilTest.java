package student_aleksandrs_korsaks.ak_lesson_8.level_4_5;

class ShapeUtilTest {

    ShapeUtil shapeUtil = new ShapeUtil();

    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.calculateAreaTest();
        shapeUtilTest.calculatePerimeterTest();
    }

    public void calculateAreaTest() {

        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double expectedResult = shapes[0].calculateArea() + shapes[1].calculateArea() + shapes[2].calculateArea() + shapes[3].calculateArea();
        double actualResult = shapeUtil.calculateArea(shapes);
        checkResult("calculateAreaTest", expectedResult == actualResult);
    }

    public void calculatePerimeterTest() {

        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double expectedResult = shapes[0].calculatePerimeter() + shapes[1].calculatePerimeter() + shapes[2].calculatePerimeter() + shapes[3].calculatePerimeter();
        double actualResult = shapeUtil.calculatePerimeter(shapes);
        checkResult("calculatePerimeterTest", expectedResult == actualResult);
    }

    public void checkResult(String nameOfTest, boolean result) {
        if (result) {
            System.out.println("\"" + nameOfTest + "\"" + " test = OK");
        } else {
            System.out.println("\"" + nameOfTest + "\"" + " test = FAIL");
        }
    }

}
