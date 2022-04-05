package student_aleksandr_zuk.lesson_8.level_4;

class Triangle extends Shape {

    private double base;
    private double height;

    Triangle(String title, double base) {
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
