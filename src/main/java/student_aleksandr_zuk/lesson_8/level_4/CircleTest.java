package student_aleksandr_zuk.lesson_8.level_4;

class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();

    }

    void checkResult(double expectedResult, double actualResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void calculateAreaTest(){
        Circle circle = new Circle("Circle", 2);
        double expectedResult = 12.566370614359172;
        double actualResult = circle.calculateArea();
        checkResult(expectedResult,actualResult,"Circle area test");

    }
    public void calculatePerimeterTest() {
        Circle circle = new Circle("Circle", 2);
        double expectedResult = 12.566370614359172;
        double actualResult = circle.calculateArea();
        checkResult(expectedResult, actualResult, "Circle perimeter test");
    }
}
