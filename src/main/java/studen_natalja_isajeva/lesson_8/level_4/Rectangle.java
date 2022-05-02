package studen_natalja_isajeva.lesson_8.level_4;

class Rectangle extends Shape{
    private double sideOne;
    private double sideTwo;

    Rectangle(String title, double sideOne, double sideTwo) {
        super(title);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    double calculateArea() {
        return sideOne * sideTwo;
    }

    @Override
    double calculatePerimeter() {
        return 2 * ( sideTwo + sideTwo);
    }
}
