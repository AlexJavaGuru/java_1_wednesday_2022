package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_4_junior;

class Circle extends Shape {

    public static final double PI_CONSTANT = 3.14;

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return PI_CONSTANT * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * PI_CONSTANT * radius;
    }


}
