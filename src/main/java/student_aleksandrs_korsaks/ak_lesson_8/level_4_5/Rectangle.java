package student_aleksandrs_korsaks.ak_lesson_8.level_4_5;

class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return Math.round((sideA * sideB) * 100.00) / 100.00;
    }

    @Override
    double calculatePerimeter() {
        return Math.round((2 * (sideA + sideB)) * 100.00) / 100.00;
    }
}
