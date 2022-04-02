package student_aleksandrs_korsaks.ak_lesson_8.level_4;

class CircleTest {

    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.shouldCalculateCircleArea();
        circleTest.shouldCalculateCirclePerimeter();

    }

    public void shouldCalculateCircleArea() {
        Circle circle = new Circle("Circle", 100);
        double expectedResult = 31415.93;
        double realResult = circle.calculateArea();
        checkResult("shouldCalculateCircleArea", expectedResult == realResult);
    }

    public void shouldCalculateCirclePerimeter() {
        Circle circle = new Circle("Circle", 100);
        double expectedResult = 628.32;
        double realResult = circle.calculatePerimeter();
        checkResult("shouldCalculateCirclePerimeter", expectedResult == realResult);
    }

    public void checkResult(String nameOfTest, boolean result) {
        if (result) {
            System.out.println("\"" + nameOfTest + "\"" + " test = OK");
        } else {
            System.out.println("\"" + nameOfTest + "\"" + " test = FAIL");
        }
    }
}
