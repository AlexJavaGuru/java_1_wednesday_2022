package studen_natalja_isajeva.lesson_8.level_4;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.testCalculateArea();
        test.testCalculatePerimeter();

    }

    public void testCalculateArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 6, 5);
        double expectedResult = 30;
        double actualResult = rectangle.calculateArea();
        if (expectedResult == actualResult) {
            System.out.println("Rectangle area is correct");
        } else {
            System.out.println("Rectangle area is not correct");
        }
    }
    public void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle", 6, 5);
        double expectedResult = 24;
        double actualResult = rectangle.calculatePerimeter();
        if (expectedResult == actualResult) {
            System.out.println("Rectangle perimeter is correct");
        } else {
            System.out.println("Rectangle perimeter is not correct");
        }
    }
}
