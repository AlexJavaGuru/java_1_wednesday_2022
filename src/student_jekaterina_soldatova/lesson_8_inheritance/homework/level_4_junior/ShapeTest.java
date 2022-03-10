package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_4_junior;

class ShapeTest {
    public static void main(String[] args) {
        ShapeTest test = new ShapeTest();

        test.circleArea();
        test.circlePerimeter();

        test.squareArea();
        test.squarePerimeter();
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
            System.out.println("Circle perimeter = FAIL, result is " + realResult);
        }
    }

    static void squareArea() {
        Square square = new Square("square", 5.0);
        double expectedResult = 25.0;
        double realResult = square.calculateArea();

        if (expectedResult == realResult) {
            System.out.println("square area = OK");
        } else {
            System.out.println("Circle area = FAIL, result is " + realResult);
        }
    }

    static void squarePerimeter() {
        Square square = new Square("square", 5.0);
        double expectedResult = 20.0;
        double realResult = square.calculatePerimeter();

        if (expectedResult == realResult) {
            System.out.println("square perimeter = OK");
        } else {
            System.out.println("Circle perimeter = FAIL, result is " + realResult);
        }
    }
}
