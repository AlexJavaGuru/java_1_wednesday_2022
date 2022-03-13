package studen_natalja_isajeva.lesson_8.level_4;

class CircleTest {
    public static void main(String[] args) {

    }

    public void testCalculateArea() {
        Circle circle = new Circle("Circle", 6);
        double expectedResult = 113.09733552923255;
        double actualResult = circle.calculateArea();
        if (expectedResult == actualResult) {
            System.out.println("Circle area is correct");
        } else {
            System.out.println("Circle area is not correct");
        }
    }
}
