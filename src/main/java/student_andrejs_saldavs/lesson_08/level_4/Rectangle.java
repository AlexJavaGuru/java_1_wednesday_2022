package student_andrejs_saldavs.lesson_08.level_4;

class Rectangle extends Shape {

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
        return sideOne * 2 + sideTwo * 2;
    }
}
