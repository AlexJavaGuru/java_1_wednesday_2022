package student_jekaterina_soldatova.lesson_8_inheritance.lessoncode.shapes;

import teacher.lesson_8_inheritance.lessoncode.shapes.Shape;

public class Square extends Shape {

    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    double area() {
        return side * 2;
    }
}
