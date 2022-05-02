package student_aleksandrs_korsaks.ak_lesson_8.level_4_5;

class RectangleTest {

    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.shouldCalculateRectangleArea();
        rectangleTest.shouldCalculateRectanglePerimeter();

    }

    public void shouldCalculateRectangleArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 10, 2);
        double expectedResult = 20;
        double realResult = rectangle.calculateArea();
        checkResult("shouldCalculateRectangleArea", expectedResult == realResult);
    }

    public void shouldCalculateRectanglePerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle", 10, 2);
        double expectedResult = 24;
        double realResult = rectangle.calculatePerimeter();
        checkResult("shouldCalculateRectanglePerimeter", expectedResult == realResult);
    }

    public void checkResult(String nameOfTest, boolean result) {
        if (result) {
            System.out.println("\"" + nameOfTest + "\"" + " test = OK");
        } else {
            System.out.println("\"" + nameOfTest + "\"" + " test = FAIL");
        }
    }
}

