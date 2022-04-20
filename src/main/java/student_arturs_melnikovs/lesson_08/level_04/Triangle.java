package student_arturs_melnikovs.lesson_08.level_04;

class Triangle extends Shape{
    private int side;

    Triangle(String title, int side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }
}
