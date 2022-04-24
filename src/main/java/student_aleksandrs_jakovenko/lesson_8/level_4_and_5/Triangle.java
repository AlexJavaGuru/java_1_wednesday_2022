package student_aleksandrs_jakovenko.lesson_8.level_4_and_5;

class Triangle extends Shape {

    private double size;

    Triangle(String title, double size) {
        super(title);
        this.size = size;
    }

    @Override
    double calculateArea() {
        return (Math.sqrt(3) * (size * size)) / 4;
    }

    @Override
    double calculatePerimeter() {
        return size + size + size;
    }
}
