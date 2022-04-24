package student_andrejs_saldavs.lesson_08.level_4;

class CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.areaTest();
        circleTest.perimeterTest();
    }

    public void areaTest() {
        Circle circleTest = new Circle("Circle", 10);
        double expectedResult = 314.1592653589793;
        double actualResult = circleTest.calculateArea();
        checkResult(expectedResult, actualResult, "Circle area test");
    }

    public void perimeterTest() {
        Circle circleTest = new Circle("Circle", 10);
        double expectedResult = 62.83185307179586;
        double actualResult = circleTest.calculatePerimeter();
        checkResult(expectedResult, actualResult, "Circle perimeter test");
    }

    void checkResult(double expectedResult, double actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedResult + " but actual is " + actualResult);
        }
    }
}
