package studen_natalja_isajeva.lesson_8.level_4;

class Triangle extends Shape{
    private double sideTriangle;

    Triangle(String title, double sideTriangle) {
        super(title);
        this.sideTriangle = sideTriangle;
    }

    @Override
    double calculateArea() {
        return Math.sqrt(3) / 4 * sideTriangle * sideTriangle;
    }

    @Override
    double calculatePerimeter() {
        return 3 * sideTriangle;
    }
}
