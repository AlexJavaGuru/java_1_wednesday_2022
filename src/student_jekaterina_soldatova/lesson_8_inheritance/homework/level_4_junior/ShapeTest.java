package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_4_junior;

class ShapeTest {
    public static void main(String[] args) {
        ShapeTest test = new ShapeTest();

        test.circleArea();
        test.circlePerimeter();
    }

    static void circleArea() {
        Circle circle = new Circle("circle", 5);
        double expectedResult = 78.5;
        double realResult = circle.calculateArea();

        if (expectedResult == realResult) {
            System.out.println("circle are = OK");
        } else {
            System.out.println("Circle area = FAIL, result is " + realResult);
        }
    }

    static void circlePerimeter() {
        Circle circle = new Circle("circle", 5.0);
        double expectedResult = 31.4;
        double realResult = Math.round(circle.calculatePerimeter() * 100.0) / 100.0;

        if (expectedResult == realResult) {
            System.out.println("circle are = OK");
        } else {
            System.out.println("Circle area = FAIL, result is " + realResult);
        }
    }
}
