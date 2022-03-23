package student_aleksandrs_jakovenko.lesson_8.level_4_and_5;

class Rectangle extends Shape {

    private double width;
    private double height;

    Rectangle(String title, double width, double height) {
        super(title);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}
