package student_aleksandrs_korsaks.ak_lesson_8.level_4;

class SquareTest {

    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.shouldCalculateSquareArea();
        squareTest.shouldCalculateSquarePerimeter();

    }

    public void shouldCalculateSquareArea() {
        Square square = new Square("Square", 10);
        double expectedResult = 100;
        double realResult = square.calculateArea();
        checkResult("shouldCalculateSquareArea", expectedResult == realResult);
    }

    public void shouldCalculateSquarePerimeter() {
        Square square = new Square("Square", 10);
        double expectedResult = 40;
        double realResult = square.calculatePerimeter();
        checkResult("shouldCalculateSquarePerimeter", expectedResult == realResult);
    }

    public void checkResult(String nameOfTest, boolean result) {
        if (result) {
            System.out.println("\"" + nameOfTest + "\"" + " test = OK");
        } else {
            System.out.println("\"" + nameOfTest + "\"" + " test = FAIL");
        }
    }
}

