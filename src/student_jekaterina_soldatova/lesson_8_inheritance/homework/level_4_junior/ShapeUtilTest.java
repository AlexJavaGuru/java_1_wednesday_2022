package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_4_junior;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        Shape[] shapes = createArray();

        test.calculateArea(shapes);
        test.calculatePerimeter(shapes);
    }

    static Shape[] createArray() {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("circle", 5.0);
        shapes[1] = new Square("square", 5.0);
        shapes[2] = new Rectangle("rectangle", 5.0, 6.0);
        shapes[3] = new Triangle("triangle", 5.0);
        return shapes;
    }

    void calculateArea(Shape[] shapes) {
        ShapeUtil util = new ShapeUtil();
        double expectedResult = 144.32531754730547;
        double realResult = util.calculateArea(shapes);
        if (expectedResult == realResult) {
            System.out.println("shapes array area = OK");
        } else {
            System.out.println("shapes array area = FAIL, result is " + realResult);
        }
    }

    void calculatePerimeter(Shape[] shapes) {
        ShapeUtil util = new ShapeUtil();
        double expectedResult = 88.4;
        double realResult = util.calculatePerimeter(shapes);
        if (expectedResult == realResult) {
            System.out.println("shapes perimeter area = OK");
        } else {
            System.out.println("shapes perimeter area = FAIL, result is " + realResult);
        }
    }

}
