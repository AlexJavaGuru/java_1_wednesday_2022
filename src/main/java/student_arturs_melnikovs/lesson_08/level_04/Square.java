package student_arturs_melnikovs.lesson_08.level_04;

class Square extends Shape {
    private int side;
    private final int NUMBER_OF_SIDES = 4;

    Square(String title, int side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * NUMBER_OF_SIDES;
    }
}
