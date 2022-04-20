package studen_natalja_isajeva.lesson_8.level_4;

class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.testCalculateArea();
        test.testCalculatePerimeter();

    }

    public void testCalculateArea() {
        Circle circle = new Circle("Circle", 6);
        double expectedResult = 113.09733552923255;
        double actualResult = circle.calculateArea();
        if (expectedResult == actualResult) {
            System.out.println("Circle area is correct");
        } else {
            System.out.println("Circle area is not correct");
        }
    }
    public void testCalculatePerimeter() {
        Circle circle = new Circle("Circle", 6);
        double expectedResult = 37.69911184307752;
        double actualResult = circle.calculatePerimeter();
        if (expectedResult == actualResult) {
            System.out.println("Circle perimeter is correct");
        } else {
            System.out.println("Circle perimeter is not correct");
        }
    }
}
