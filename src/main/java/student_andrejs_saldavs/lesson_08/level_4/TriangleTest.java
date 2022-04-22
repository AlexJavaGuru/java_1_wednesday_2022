package student_andrejs_saldavs.lesson_08.level_4;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.areaTest();
        triangleTest.perimeterTest();
    }

    public void perimeterTest() {
        Triangle triangleTest = new Triangle("Triangle", 2);
        double expectedResult = 6;
        double actualResult = triangleTest.calculatePerimeter();
        checkResult(expectedResult, actualResult, "Triangle perimeter test");
    }

    public void areaTest() {
        Triangle triangleTest = new Triangle("Triangle", 2);
        double expectedResult = 1.7320508075688772;
        double actualResult = triangleTest.calculateArea();
        checkResult(expectedResult, actualResult, "Triangle area test");
    }

    void checkResult(double expectedResult, double actualResult, String testName) {
        if(actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedResult + " but actual is " + actualResult);
        }
    }

}
