package studen_natalja_isajeva.lesson_8.level_4;

class SquareTest {

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.testCalculateArea();
        test.testCalculatePerimeter();

    }

    public void testCalculateArea() {
        Square square = new Square("Square", 6);
        double expectedResult = 36;
        double actualResult = square.calculateArea();
        if (expectedResult == actualResult) {
            System.out.println("Square area is correct");
        } else {
            System.out.println("Square area is not correct");
        }
    }
    public void testCalculatePerimeter() {
        Square square = new Square("Square", 6);
        double expectedResult = 24;
        double actualResult = square.calculatePerimeter();
        if (expectedResult == actualResult) {
            System.out.println("Square perimeter is correct");
        } else {
            System.out.println("Square perimeter is not correct");
        }
    }
}
