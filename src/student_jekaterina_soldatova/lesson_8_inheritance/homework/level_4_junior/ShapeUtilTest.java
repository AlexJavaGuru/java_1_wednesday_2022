package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_4_junior;

import java.util.Arrays;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest demo = new ShapeUtilTest();
        Shape[] shapes = createArray();

        demo.calculateArea(shapes);
        demo.calculatePerimeter(shapes);
    }

    static Shape[] createArray() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        for (int i = 0; i < 4; i++) {
            shapes[i] = shapeUtil.createRandomShape();
        }
//        shapes[0] = shapeUtil.createRandomCircle();
//        shapes[1] = shapeUtil.createRandomSquare();
//        shapes[2] = shapeUtil.createRandomRectangle();
//        shapes[3] = shapeUtil.createRandomTriangle();
        return shapes;
    }

    void calculateArea(Shape[] shapes) {
        ShapeUtil util = new ShapeUtil();
        double expectedResult = expectedArea(shapes);
        double realResult = util.calculateArea(shapes);
        if (expectedResult == realResult) {
            System.out.println("shapes array area = OK");
        } else {
            System.out.println("shapes array area = FAIL, result is " + realResult);
        }

    }

    void calculatePerimeter(Shape[] shapes) {
        ShapeUtil util = new ShapeUtil();
        double expectedResult = expectedPerimeter(shapes);
        double realResult = util.calculatePerimeter(shapes);
        if (expectedResult == realResult) {
            System.out.println("shapes perimeter area = OK");
        } else {
            System.out.println("shapes perimeter area = FAIL, result is " + realResult);
        }

    }


    double expectedArea(Shape[] shapes) {
        ShapeUtil util = new ShapeUtil();
        double result = 0.0;
        for (Shape shape: shapes) {
            result += util.calculateArea(shape);
        }
        return result;
    }

    double expectedPerimeter(Shape[] shapes) {
        ShapeUtil util = new ShapeUtil();
        double result = 0.0;
        for (Shape shape: shapes) {
            result += util.calculatePerimeter(shape);
        }
        return result;
    }
}
