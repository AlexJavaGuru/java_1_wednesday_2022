package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_4_junior;

class ShapeTest {
    public static void main(String[] args) {
        ShapeTest test = new ShapeTest();

        test.circleArea();
        test.circlePerimeter();

        test.squareArea();
        test.squarePerimeter();

        test.rectangleArea();
        test.rectanglePerimeter();

        test.triangleArea();
        test.trianglePerimeter();

    }

    static void circleArea() {
        Circle circle = new Circle("circle", 5);
        double expectedResult = 78.5;
        double realResult = circle.calculateArea();

        if (expectedResult == realResult) {
            System.out.println("circle area = OK");
        } else {
            System.out.println("Circle area = FAIL, result is " + realResult);
        }
    }

    static void circlePerimeter() {
        Circle circle = new Circle("circle", 5.0);
        double expectedResult = 31.4;
        double realResult = Math.round(circle.calculatePerimeter() * 100.0) / 100.0;

        if (expectedResult == realResult) {
            System.out.println("circle perimeter = OK");
        } else {
            System.out.println("circle perimeter = FAIL, result is " + realResult);
        }
    }


    static void squareArea() {
        Square square = new Square("square", 5.0);
        double expectedResult = 25.0;
        double realResult = square.calculateArea();

        if (expectedResult == realResult) {
            System.out.println("square area = OK");
        } else {
            System.out.println("square area = FAIL, result is " + realResult);
        }
    }

    static void squarePerimeter() {
        Square square = new Square("square", 5.0);
        double expectedResult = 20.0;
        double realResult = square.calculatePerimeter();

        if (expectedResult == realResult) {
            System.out.println("square perimeter = OK");
        } else {
            System.out.println("square perimeter = FAIL, result is " + realResult);
        }
    }


    static void rectangleArea() {
        Rectangle rectangle = new Rectangle("rectangle", 5.0, 6.0);
        double expectedResult = 30.0;
        double realResult = rectangle.calculateArea();

        if (expectedResult == realResult) {
            System.out.println("rectangle area = OK");
        } else {
            System.out.println("rectangle area = FAIL, result is " + realResult);
        }
    }

    static void rectanglePerimeter() {
        Rectangle rectangle = new Rectangle("rectangle", 5.0, 6.0);
        double expectedResult = 22.0;
        double realResult = rectangle.calculatePerimeter();

        if (expectedResult == realResult) {
            System.out.println("rectangle perimeter = OK");
        } else {
            System.out.println("rectangle perimeter = FAIL, result is " + realResult);
        }
    }


    static void triangleArea() {
        Triangle triangle = new Triangle("triangle", 5.0);
        double expectedResult = 10.83;
        double realResult = Math.round(triangle.calculateArea() * 100.0) / 100.0;

        if (expectedResult == realResult) {
            System.out.println("triangle area = OK");
        } else {
            System.out.println("triangle area = FAIL, result is " + realResult);
        }
    }

    static void trianglePerimeter() {
        Triangle triangle = new Triangle("triangle", 5.0);
        double expectedResult = 15.0;
        double realResult = triangle.calculatePerimeter();

        if (expectedResult == realResult) {
            System.out.println("triangle perimeter = OK");
        } else {
            System.out.println("triangle perimeter = FAIL, result is " + realResult);
        }
    }
}
