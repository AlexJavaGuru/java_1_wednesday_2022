package student_andrejs_saldavs.lesson_08.level_4;

class SquareTest {
    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.areaTest();
        squareTest.perimeterTest();
    }

    public void areaTest() {
        Square squareTest = new Square("Square", 5);
        double expectedResult = 25;
        double actualResult = squareTest.calculateArea();
        checkResult(expectedResult, actualResult, "Square area test");
    }

    public void perimeterTest() {
        Square squareTest = new Square("Square", 5);
        double expectedResult = 20;
        double actualResult = squareTest.calculatePerimeter();
        checkResult(expectedResult, actualResult, "Square perimeter test");
    }

    void checkResult(double expectedResult, double actualResult, String testName) {
        if(actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedResult + " but actual is " + actualResult);
        }
    }

}
