package studen_natalja_isajeva.lesson_8.level_4;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.testCalculateArea();
        test.testCalculatePerimeter();

    }

    public void testCalculateArea() {
        Triangle triangle = new Triangle("Triangle", 6);
        double expectedResult = 15.588457268119894;
        double actualResult = triangle.calculateArea();
        if (expectedResult == actualResult) {
            System.out.println("Triangle area is correct");
        } else {
            System.out.println("Triangle area is not correct");
        }
    }
    public void testCalculatePerimeter() {
        Triangle triangle = new Triangle("Triangle", 6);
        double expectedResult = 18;
        double actualResult = triangle.calculatePerimeter();
        if (expectedResult == actualResult) {
            System.out.println("Triangle perimeter is correct");
        } else {
            System.out.println("Triangle perimeter is not correct");
        }
    }
}
