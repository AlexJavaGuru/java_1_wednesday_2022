package student_andrejs_saldavs.lesson_08.level_4;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.areaTest();
        rectangleTest.perimeterTest();
    }

    public void areaTest() {
        Rectangle rectangleTest = new Rectangle("Rectangle", 3, 5);
        double expectedResult = 15;
        double actualResult = rectangleTest.calculateArea();
        checkResult(expectedResult, actualResult, "Rectangle area test");
    }

    public void perimeterTest() {
        Rectangle rectangleTest = new Rectangle("Rectanlge", 3, 5);
        double expectedResult = 16;
        double actualResult = rectangleTest.calculatePerimeter();
        checkResult(expectedResult, actualResult, "Rectangle perimeter test");
    }

    void checkResult(double expectedResult, double actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedResult + " but actual is " + actualResult);
        }
    }

}
