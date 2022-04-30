package teacher.lesson_8_inheritance.lessoncode.shapes;

public class Circle extends Shape {

    public static final double PI_CONSTANT = 3.14159265358979323846;

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return PI_CONSTANT * radius * radius;
    }
}
