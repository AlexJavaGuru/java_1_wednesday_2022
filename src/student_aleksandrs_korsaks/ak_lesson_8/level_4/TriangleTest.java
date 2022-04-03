package student_aleksandrs_korsaks.ak_lesson_8.level_4;

class TriangleTest {

    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.shouldCalculateTriangleArea();
        triangleTest.shouldCalculateTrianglePerimeter();

    }

    public void shouldCalculateTriangleArea() {
        Triangle triangle = new Triangle("Triangle", 10);
        double expectedResult = 43.30;
        double realResult = triangle.calculateArea();
        checkResult("shouldCalculateTriangleArea", expectedResult == realResult);
    }

    public void shouldCalculateTrianglePerimeter() {
        Triangle triangle = new Triangle("Triangle", 10);
        double expectedResult = 30;
        double realResult = triangle.calculatePerimeter();
        checkResult("shouldCalculateTrianglePerimeter", expectedResult == realResult);
    }

    public void checkResult(String nameOfTest, boolean result) {
        if (result) {
            System.out.println("\"" + nameOfTest + "\"" + " test = OK");
        } else {
            System.out.println("\"" + nameOfTest + "\"" + " test = FAIL");
        }
    }
}


