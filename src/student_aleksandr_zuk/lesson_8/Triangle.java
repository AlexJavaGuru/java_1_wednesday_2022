package student_aleksandr_zuk.lesson_8;

class Triangle extends Shape {

    private double base;
    private double height;

    Triangle(String title, double base, double height) {
        super(title);
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    double calculatePerimeter() {
        return base * 3;
    }
}
